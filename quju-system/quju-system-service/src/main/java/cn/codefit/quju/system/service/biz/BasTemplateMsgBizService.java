package cn.codefit.quju.system.service.biz;

import cn.codefit.quju.system.api.dto.BasTemplateMsgDto;
import cn.codefit.quju.system.api.vo.BasTemplateMsgVo;
import com.github.pagehelper.PageInfo;

/**
 * 小程序模板消息biz服务相关接口
 */
public interface BasTemplateMsgBizService {
    /**
     * 获取模板消息发送记录
     *
     * @param basTemplateMsgVo
     * @return
     */
    PageInfo<BasTemplateMsgDto> getBasTemplateMsgList(BasTemplateMsgVo basTemplateMsgVo);


}
