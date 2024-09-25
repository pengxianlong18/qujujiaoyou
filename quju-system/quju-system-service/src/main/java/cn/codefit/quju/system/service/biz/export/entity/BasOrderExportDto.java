package cn.codefit.quju.system.service.biz.export.entity;

import cn.codefit.quju.base.model.BaseDtoBean;
import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import lombok.Data;

import java.util.Date;

/**
 * 订单导出类
 */
@Data
public class BasOrderExportDto extends BaseDtoBean {

    /**
     * 系统订单号
     */
    @ExcelProperty(value = "系统订单号")
    private String outTradeNo;
    /**
     * 支付宝交易号/微信支付订单号
     */
    @ExcelProperty(value = "第三方订单号")
    private String tradeNo;
    /**
     * 下单用户昵称
     */
    @ExcelProperty(value = "下单用户昵称")
    private String nickName;
    /**
     * 活动编号
     */
    @ExcelProperty(value = "关联活动编号")
    private String activityNo;


    /**
     * 订单状态(支付宝支付完成之后会返回TRADE_SUCCESS、微信同样也添加一个这样的操作 TRADE_SUCCESS)
     * 默认忽略字段，需要转义
     */
    @ExcelIgnore
    private String tradeStatus;
    /**
     * 订单状态(支付宝支付完成之后会返回TRADE_SUCCESS、微信同样也添加一个这样的操作 TRADE_SUCCESS)
     */
    @ExcelProperty(value = "订单状态")
    private String tradeStatusStr;

    /**
     * 订单价格 人民币/元,其中微信单位为分需要转换为元）
     */
    @ExcelProperty(value = "支付金额")
    private String payMoney;

    /**
     * 下单时间
     */
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ExcelProperty("下单时间")
    private Date createTime;
    /**
     * 支付完成时间(系统)
     */
    @DateTimeFormat("yyyy年MM月dd日HH时mm分ss秒")
    @ExcelProperty("支付完成时间")
    private Date updateTime;


}
