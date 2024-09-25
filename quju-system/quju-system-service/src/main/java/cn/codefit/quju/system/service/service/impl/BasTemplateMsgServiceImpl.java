package cn.codefit.quju.system.service.service.impl;

import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.system.api.dto.BasTemplateMsgDto;
import cn.codefit.quju.system.api.service.BasTemplateMsgService;
import cn.codefit.quju.system.api.vo.BasTemplateMsgVo;
import cn.codefit.quju.system.service.biz.BasTemplateMsgBizService;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * 小程序模板消息服务相关接口
 */
@DubboService(version = Constant.VERSION, interfaceClass = BasTemplateMsgService.class)
@RequestMapping(value = "/template")
@RestController
@Slf4j
public class BasTemplateMsgServiceImpl implements BasTemplateMsgService {

    @Autowired
    private BasTemplateMsgBizService basTemplateMsgBizService;

    /**
     * 获取模板消息发送记录
     *
     * @param basTemplateMsgVo
     * @return
     */
    @Override
    @RequestMapping(value = "/getBasTemplateMsgList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public CommonResponse<PageInfo<BasTemplateMsgDto>> getBasTemplateMsgList(@RequestBody BasTemplateMsgVo basTemplateMsgVo) {
        PageInfo<BasTemplateMsgDto> pageInfo = basTemplateMsgBizService.getBasTemplateMsgList(basTemplateMsgVo);
        return CommonResponse.success(pageInfo);
    }
}
