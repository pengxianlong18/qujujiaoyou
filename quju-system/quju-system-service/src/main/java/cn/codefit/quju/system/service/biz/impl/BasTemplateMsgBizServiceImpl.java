package cn.codefit.quju.system.service.biz.impl;

import cn.codefit.quju.base.enums.ConstantEnum;
import cn.codefit.quju.system.api.dto.BasTemplateMsgDto;
import cn.codefit.quju.system.api.vo.BasTemplateMsgVo;
import cn.codefit.quju.system.service.biz.BasTemplateMsgBizService;
import cn.codefit.quju.system.service.biz.dao.ApletUserBizMapper;
import cn.codefit.quju.system.service.biz.dao.BasTemplateMsgBizMapper;
import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * 小程序模板消息biz服务相关接口
 */
@Slf4j
@Service
public class BasTemplateMsgBizServiceImpl implements BasTemplateMsgBizService {


    @Autowired
    private BasTemplateMsgBizMapper basTemplateMsgBizMapper;
    @Autowired
    private ApletUserBizMapper apletUserBizMapper;


    /**
     * 获取模板消息发送记录
     *
     * @param basTemplateMsgVo
     * @return
     */
    @Override
    public PageInfo<BasTemplateMsgDto> getBasTemplateMsgList(BasTemplateMsgVo basTemplateMsgVo) {
        Map<String, Object> map = BeanUtil.copyProperties(basTemplateMsgVo, Map.class);
        map.put("isDeleted", ConstantEnum.IS_DELETE_NO.getCode());
        int pageNum = basTemplateMsgVo.getPageNum();
        int pageSize = basTemplateMsgVo.getPageSize();

        PageHelper.startPage(pageNum, pageSize);
        List<BasTemplateMsgDto> list = basTemplateMsgBizMapper.selectByMap(map);
        list.forEach(item -> {
            item.setNickname(getNickName(item.getTouser()));
        });
        PageInfo<BasTemplateMsgDto> pageInfo = new PageInfo(list);
        if (CollectionUtils.isEmpty(list)) {
            return new PageInfo<>(new ArrayList<>());
        }
        return pageInfo;
    }

    private String getNickName(String toUser) {
        String nickName = apletUserBizMapper.selectNickName(toUser);
        return nickName;
    }
}
