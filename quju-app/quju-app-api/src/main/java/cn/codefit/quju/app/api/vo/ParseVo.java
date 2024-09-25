package cn.codefit.quju.app.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Data;

@Data
public class ParseVo extends BaseBean {


   /**
    * 动态id
    */
    private Long cdId;
   /**
    *动作 1-点赞 2-取消
    */
   private int op;
   /**
    *动态类型 1圈子 2个人
    */
   private int dynamicType;


}
