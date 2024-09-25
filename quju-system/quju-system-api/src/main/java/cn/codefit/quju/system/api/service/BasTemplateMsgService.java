package cn.codefit.quju.system.api.service;


import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.system.api.dto.BasTemplateMsgDto;
import cn.codefit.quju.system.api.vo.BasTemplateMsgVo;
import com.github.pagehelper.PageInfo;

/**
 * 小程序模板消息b服务相关接口
 */
public interface BasTemplateMsgService {


    /**
     * 获取模板消息发送记录
     *
     * @param basTemplateMsgVo
     * @return
     */
    CommonResponse<PageInfo<BasTemplateMsgDto>> getBasTemplateMsgList(BasTemplateMsgVo basTemplateMsgVo);


}
