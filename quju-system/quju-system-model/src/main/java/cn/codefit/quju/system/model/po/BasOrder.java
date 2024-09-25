package cn.codefit.quju.system.model.po;

import java.io.Serializable;
import java.util.Date;

public class BasOrder implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

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
     * 交易类型  默认是app
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
     * 充值类型0、活动报名支付
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
     * 实付金额  订单剩余额度 有退款额度会减小
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
     * 0、支付宝订单;1、微信订单;2、华为订单
     */
    private Integer orderType;

    /**
     * 是否有退款 0-没有退款 1-有退款 real  fee 减去退款金额
     */
    private Integer isRefund;

    /**
     * 退款单号 支付宝或者微信退款单号
     */
    private String refundTradeNo;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo == null ? null : outTradeNo.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getActivityNo() {
        return activityNo;
    }

    public void setActivityNo(String activityNo) {
        this.activityNo = activityNo == null ? null : activityNo.trim();
    }

    public Integer getCoin() {
        return coin;
    }

    public void setCoin(Integer coin) {
        this.coin = coin;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr == null ? null : nonceStr.trim();
    }

    public String getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus == null ? null : tradeStatus.trim();
    }

    public Integer getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(Integer rechargeType) {
        this.rechargeType = rechargeType;
    }

    public String getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(String payMoney) {
        this.payMoney = payMoney == null ? null : payMoney.trim();
    }

    public String getDiscountsFee() {
        return discountsFee;
    }

    public void setDiscountsFee(String discountsFee) {
        this.discountsFee = discountsFee == null ? null : discountsFee.trim();
    }

    public String getRealFee() {
        return realFee;
    }

    public void setRealFee(String realFee) {
        this.realFee = realFee == null ? null : realFee.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getBuyerLogonId() {
        return buyerLogonId;
    }

    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId == null ? null : buyerLogonId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd == null ? null : timeEnd.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public Integer getIsRefund() {
        return isRefund;
    }

    public void setIsRefund(Integer isRefund) {
        this.isRefund = isRefund;
    }

    public String getRefundTradeNo() {
        return refundTradeNo;
    }

    public void setRefundTradeNo(String refundTradeNo) {
        this.refundTradeNo = refundTradeNo == null ? null : refundTradeNo.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", outTradeNo=").append(outTradeNo);
        sb.append(", userId=").append(userId);
        sb.append(", nickName=").append(nickName);
        sb.append(", activityNo=").append(activityNo);
        sb.append(", coin=").append(coin);
        sb.append(", body=").append(body);
        sb.append(", tradeType=").append(tradeType);
        sb.append(", nonceStr=").append(nonceStr);
        sb.append(", tradeStatus=").append(tradeStatus);
        sb.append(", rechargeType=").append(rechargeType);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", discountsFee=").append(discountsFee);
        sb.append(", realFee=").append(realFee);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", buyerLogonId=").append(buyerLogonId);
        sb.append(", createTime=").append(createTime);
        sb.append(", timeEnd=").append(timeEnd);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", platform=").append(platform);
        sb.append(", orderType=").append(orderType);
        sb.append(", isRefund=").append(isRefund);
        sb.append(", refundTradeNo=").append(refundTradeNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
