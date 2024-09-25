package cn.codefit.quju.system.api.vo;

import cn.codefit.quju.base.model.BaseBean;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Builder
public class BasOrderVo extends BaseBean {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 主键ID
     */
    private List<Long> orderIds;

    /**
     * 系统订单号
     */
    private String outTradeNo;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 下单用户昵称
     */
    private String nickName;

    /**
     * 活动编号
     */
    private String activityNo;

    /**
     * 订单对应金币数量
     */
    private Integer coin;

    /**
     * 商品描述
     */
    private String body;

    /**
     * 交易类型 默认是app
     */
    private String tradeType;

    /**
     * 随机字符串(微信有、支付宝默认为 zhifubao)
     */
    private String nonceStr;

    /**
     * 订单状态(支付宝支付完成之后会返回TRADE_SUCCESS、微信同样也添加一个这样的操作 TRADE_SUCCESS)
     */
    private String tradeStatus;

    /**
     * 充值类型0、我的界面金币充值；1、男性vip充值；2、女性vip充值；3、告白气球充值；4、私聊场景充值 5、华为充值 6、活动报名
     * 7、商家打款到个人账户
     */
    private Integer rechargeType;

    /**
     * 订单价格 人民币/元,其中微信单位为分需要转换为元）
     */
    private String payMoney;

    /**
     * 优惠金额
     */
    private String discountsFee;

    /**
     * 实付金额 订单剩余额度 有退款额度会减小
     */
    private String realFee;

    /**
     * 支付宝交易号/微信支付订单号
     */
    private String tradeNo;

    /**
     * 买家支付宝账号/微信订单默认为：weixin
     */
    private String buyerLogonId;

    /**
     * 下单时间
     */
    private Date createTime;

    /**
     * 支付完成时间(微信)
     */
    private String timeEnd;

    /**
     * 支付完成时间(系统)
     */
    private Date updateTime;

    /**
     * 平台
     */
    private Integer platform;

    /**
     * 0支付宝订单1、微信订单 2、华为订单
     */
    private Integer orderType;

    /**
     * 是否有退款 0-没有退款 1-有退款 real fee 减去退款金额
     */
    private Integer isRefund;

    /**
     * 退款单号 支付宝或者微信退款单号
     */
    private String refundTradeNo;

}
