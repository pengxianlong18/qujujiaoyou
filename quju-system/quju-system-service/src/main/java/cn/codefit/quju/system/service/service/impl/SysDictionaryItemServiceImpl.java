package cn.codefit.quju.system.service.service.impl;

import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.base.enums.ConstantEnum;
import cn.codefit.quju.base.enums.PlatformEnum;
import cn.codefit.quju.base.enums.ResponseCode;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.base.util.UserUtils;
import cn.codefit.quju.system.api.dto.SysDictionaryItemDto;
import cn.codefit.quju.system.api.service.SysDictionaryItemService;
import cn.codefit.quju.system.api.vo.SysDictionaryItemVo;
import cn.codefit.quju.system.model.dao.SysDictionaryItemMapper;
import cn.codefit.quju.system.model.po.SysDictionaryItem;
import cn.codefit.quju.system.service.biz.SysDictionaryItemBizService;
import cn.codefit.quju.system.service.biz.dao.SysDictionaryItemBizMapper;
import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
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
 * 数据字典子项接口
 * 查询、新增、删除、编辑
 */
@DubboService(version = Constant.VERSION, interfaceClass = SysDictionaryItemService.class)
@RequestMapping(value = "/dictItem")
@RestController
@Slf4j
public class SysDictionaryItemServiceImpl implements SysDictionaryItemService {

    @Autowired
    private SysDictionaryItemBizMapper sysDictionaryItemBizMapper;
    @Autowired
    private SysDictionaryItemBizService sysDictionaryItemBizService;
    @Autowired
    private SysDictionaryItemMapper sysDictionaryItemMapper;

    /**
     * 数据字典子项列表分页查询
     * 一般数据字典编码不能为空
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/querySysDictItemList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public CommonResponse<PageInfo<SysDictionaryItemDto>> querySysDictItemList(@RequestBody SysDictionaryItemVo param) {
        if (StringUtils.isBlank(param.getDictCode())) {
            return CommonResponse.error(ResponseCode.ILLEGAL_ARGUMENT);
        }
        Map<String, Object> map = BeanUtil.copyProperties(param, Map.class);
        map.put("isDeleted", ConstantEnum.IS_DELETE_NO.getCode());
        int pageNum = param.getPageNum();
        int pageSize = param.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<SysDictionaryItemDto> list = sysDictionaryItemBizMapper.selectByCondition(map);
        PageInfo<SysDictionaryItemDto> pageInfo = new PageInfo(list);
        if (CollectionUtils.isEmpty(list)) {
            return CommonResponse.success(new PageInfo<>(new ArrayList<>()));
        }
        return CommonResponse.success(pageInfo);
    }

    /**
     * 数据字典子项列表查询
     * 一般数据字典编码不能为空
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/querySysDictItemListNoPage", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public CommonResponse<List<SysDictionaryItemDto>> querySysDictItemListNoPage(@RequestBody SysDictionaryItemVo param) {
        Map<String, Object> map = BeanUtil.copyProperties(param, Map.class);
        map.put("isDeleted", ConstantEnum.IS_DELETE_NO.getCode());
        List<SysDictionaryItemDto> list = sysDictionaryItemBizMapper.selectByCondition(map);
        return CommonResponse.success(list);
    }

    /**
     * 根据id查询数据字典子项最新详情
     *
     * @param id
     * @return
     */
    @Override
    @RequestMapping(value = "/querySysDictItemById", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public CommonResponse<SysDictionaryItemDto> querySysDictItemById(@RequestParam Long id) {
        SysDictionaryItem sysDictionaryItem = sysDictionaryItemBizService.selectSysDictItemById(id);
        return CommonResponse.success(BeanUtil.copyProperties(sysDictionaryItem, SysDictionaryItem.class));
    }

    /**
     * 新增或修改数据字典子项
     *
     * @param param
     * @return
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @RequestMapping(value = "/addOrUpdateSysDictItem", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public CommonResponse<Boolean> addOrUpdateSysDictItem(@RequestBody SysDictionaryItemVo param) {
        if (param == null) {
            return CommonResponse.error(ResponseCode.ILLEGAL_ARGUMENT);
        }
        try {
            Long id = param.getId();
            SysDictionaryItem sysDictionaryItem = BeanUtil.copyProperties(param, SysDictionaryItem.class);
            //1、校验字典子项编码是否可用
            boolean result = sysDictionaryItemBizService.checkDictItemByCode(param.getItemCode(), id);
            if (result) {
                return CommonResponse.error(ResponseCode.MORE_DICT);
            }
            if (id == null) {
                sysDictionaryItem.setCreateTime(new Date());
                sysDictionaryItem.setCreateUser(UserUtils.getUserId().toString());
                sysDictionaryItem.setCreateUserName(UserUtils.getUsername());
                sysDictionaryItem.setIsDeleted(ConstantEnum.IS_DELETE_NO.getCode());
                sysDictionaryItem.setPlatform(PlatformEnum.PLATEFORM_0.getCode());
                sysDictionaryItemMapper.insert(sysDictionaryItem);
            } else {
                sysDictionaryItemBizService.updateSysDictItemById(sysDictionaryItem);
            }
            //保证子项只有一个默认值
            if (sysDictionaryItem.getIsDefault() == Constant.IS_DEFAULT) {
                sysDictionaryItemBizService.checkSysDictItemDefault(sysDictionaryItem.getDictCode(), sysDictionaryItem.getId());
            }
            return CommonResponse.success(true);
        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return CommonResponse.error(ResponseCode.FAIL_COMMON);
        }

    }

    /**
     * 删除数据字典子项
     * 仅支持单条删除且需要二次确认弹窗
     *
     * @param id
     * @return
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @RequestMapping(value = "/deleteSysDictItemById", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public CommonResponse<Boolean> deleteSysDictItemById(@RequestParam Long id) {
        if (id == null) {
            return CommonResponse.error(ResponseCode.ILLEGAL_ARGUMENT);
        }
        try {
            SysDictionaryItem sysDictionaryItem = sysDictionaryItemBizService.selectSysDictItemById(id);
            if (sysDictionaryItem == null) {
                return CommonResponse.error(ResponseCode.HAS_NO_DATA);
            }
            sysDictionaryItemBizService.deleteSysDictItemById(id);
            return CommonResponse.success(true);
        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return CommonResponse.error(ResponseCode.FAIL_COMMON);
        }
    }
}
