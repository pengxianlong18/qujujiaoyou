package cn.codefit.quju.system.service.service.impl;

import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.base.enums.ConstantEnum;
import cn.codefit.quju.base.enums.PlatformEnum;
import cn.codefit.quju.base.enums.ResponseCode;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.base.util.UserUtils;
import cn.codefit.quju.system.api.dto.SysDictionaryDto;
import cn.codefit.quju.system.api.service.SysDictionaryService;
import cn.codefit.quju.system.api.vo.SysDictionaryVo;
import cn.codefit.quju.system.model.dao.SysDictionaryMapper;
import cn.codefit.quju.system.model.po.SysDictionary;
import cn.codefit.quju.system.model.po.SysDictionaryItem;
import cn.codefit.quju.system.service.biz.SysDictionaryBizService;
import cn.codefit.quju.system.service.biz.SysDictionaryItemBizService;
import cn.codefit.quju.system.service.biz.dao.SysDictionaryBizMapper;
import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 数据字典接口
 * 查询、新增、删除、编辑
 */
@DubboService(version = Constant.VERSION, interfaceClass = SysDictionaryService.class)
@RequestMapping(value = "/dict")
@RestController
@Slf4j
public class SysDictionaryServiceImpl implements SysDictionaryService {

    @Autowired
    private SysDictionaryBizMapper sysDictionaryBizMapper;
    @Autowired
    private SysDictionaryMapper sysDictionaryMapper;

    @Autowired
    private SysDictionaryBizService sysDictionaryBizService;
    @Autowired
    private SysDictionaryItemBizService sysDictionaryItemBizService;

    /**
     * 数据字典分列表分页查询
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/querySysDictionaryList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public CommonResponse querySysDictionaryList(@RequestBody SysDictionaryVo param) {
        Map<String, Object> map = BeanUtil.copyProperties(param, Map.class);
        map.put("isDeleted", ConstantEnum.IS_DELETE_NO.getCode());
        int pageNum = param.getPageNum();
        int pageSize = param.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<SysDictionaryDto> list = sysDictionaryBizMapper.selectByCondition(map);
        PageInfo<SysDictionaryDto> pageInfo = new PageInfo(list);
        if (CollectionUtils.isEmpty(list)) {
            return CommonResponse.success(new PageInfo<>(new ArrayList<>()));
        }
        return CommonResponse.success(pageInfo);
    }

    /**
     * 根据id查询数据字典最新详情
     *
     * @param id
     * @return
     */
    @Override
    @RequestMapping(value = "/querySysDictDetailById", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public CommonResponse<SysDictionaryDto> querySysDictDetailById(@RequestParam Long id) {
        if (id == null) {
            return CommonResponse.error(ResponseCode.ILLEGAL_ARGUMENT);
        }
        SysDictionary sysDictionary = sysDictionaryBizService.selectSysDictById(id);
        return CommonResponse.success(BeanUtil.copyProperties(sysDictionary, SysDictionaryDto.class));
    }

    /**
     * 新增或修改数据字典
     *
     * @param param
     * @return
     */
    @Override
    @RequestMapping(value = "/addOrUpdateSysDict", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public CommonResponse<Boolean> addOrUpdateSysDict(@RequestBody SysDictionaryVo param) {
        if (param == null) {
            return CommonResponse.error(ResponseCode.ILLEGAL_ARGUMENT);
        }
        try {
            Long id = param.getId();
            SysDictionary sysDictionary = BeanUtil.copyProperties(param, SysDictionary.class);

            //1、校验字典编码是否可用
            boolean result = sysDictionaryBizService.checkDictByCode(param.getDictCode(), id);
            if (result) {
                return CommonResponse.error(ResponseCode.MORE_DICT);
            }
            if (id == null) {
                sysDictionary.setCreateTime(new Date());
                sysDictionary.setCreateUser(UserUtils.getUserId().toString());
                sysDictionary.setCreateUserName(UserUtils.getUsername());
                sysDictionary.setIsDeleted(ConstantEnum.IS_DELETE_NO.getCode());
                sysDictionary.setPlatform(PlatformEnum.PLATEFORM_0.getCode());
                sysDictionaryMapper.insert(sysDictionary);
            } else {
                SysDictionary old = sysDictionaryBizService.selectSysDictById(id);
                sysDictionaryBizService.updateSysDict(sysDictionary);
                //修改--要注意业务字典编码是否修改-如果修改要同步修改数据字典子项表
                if (!old.getDictCode().equals(sysDictionary.getDictCode())) {
                    SysDictionaryItem sysDictionaryItem = new SysDictionaryItem();
                    sysDictionaryItem.setDictCode(sysDictionary.getDictCode());
                    sysDictionaryItemBizService.updateSysDictItemByDictCode(sysDictionaryItem, old.getDictCode());
                }
            }
            return CommonResponse.success(true);
        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return CommonResponse.error(ResponseCode.FAIL_COMMON);
        }
    }

    /**
     * 删除数据字典
     * 仅支持单条删除且需要二次确认弹窗
     *
     * @param id
     * @return
     */
    @Override
    @RequestMapping(value = "/deleteSysDictById", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public CommonResponse<Boolean> deleteSysDictById(@RequestParam Long id) {
        if (id == null) {
            return CommonResponse.error(ResponseCode.ILLEGAL_ARGUMENT);
        }
        try {
            SysDictionary sysDictionary = sysDictionaryBizService.selectSysDictById(id);
            if (sysDictionary == null) {
                return CommonResponse.error(ResponseCode.HAS_NO_DATA);
            }
            sysDictionaryBizService.deleteSysDictBydictCode(sysDictionary.getDictCode());
            sysDictionaryItemBizService.deleteSysDictItemBydictCode(sysDictionary.getDictCode());
            return CommonResponse.success(true);
        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return CommonResponse.error(ResponseCode.FAIL_COMMON);
        }
    }
}
