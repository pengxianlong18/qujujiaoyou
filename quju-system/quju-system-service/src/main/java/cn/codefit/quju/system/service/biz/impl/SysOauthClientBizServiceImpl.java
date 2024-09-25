package cn.codefit.quju.system.service.biz.impl;

import cn.codefit.quju.base.enums.ConstantEnum;
import cn.codefit.quju.system.api.dto.SysOauthClientDto;
import cn.codefit.quju.system.api.vo.SysOauthClientVo;
import cn.codefit.quju.system.model.dao.SysOauthClientMapper;
import cn.codefit.quju.system.model.po.SysOauthClient;
import cn.codefit.quju.system.service.biz.SysOauthClientBizService;
import cn.codefit.quju.system.service.biz.dao.SysOauthClientBizMapper;
import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *
 */
@Service
public class SysOauthClientBizServiceImpl implements SysOauthClientBizService {


    @Autowired
    private SysOauthClientMapper sysOauthClientMapper;

    @Autowired
    private SysOauthClientBizMapper sysOauthClientBizMapper;


    /**
     * 根据id获取OAuth2客户端认证信息
     *
     * @param clientId
     * @return
     */
    @Override
    public SysOauthClient selectOAuth2ClientById(String clientId) {
        SysOauthClient sysOauthClient = sysOauthClientMapper.selectByPrimaryKey(clientId);
//        Assert.isTrue(sysOauthClient != null, "OAuth2 客户端不存在");
//        SysOauthClientDto sysOauthClientDto= BeanUtil.copyProperties(sysOauthClient, SysOauthClientDto.class);
        return sysOauthClient;
    }

    /**
     * 获取oauth2客户端列表
     *
     * @return
     */
    @Override
    public List<SysOauthClientDto> querySysOauthClienList(SysOauthClientVo param) {
        Map<String, Object> map = BeanUtil.copyProperties(param, Map.class);
        map.put("isDeleted", ConstantEnum.IS_DELETE_NO.getCode());
        int pageNum = param.getPageNum();
        int pageSize = param.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<SysOauthClientDto> list = sysOauthClientBizMapper.selectByCondition(map);
        return list;
    }
}
