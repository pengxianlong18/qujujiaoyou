package cn.codefit.quju.system.api.dto;

import cn.codefit.quju.base.model.BaseDtoBean;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AppletUserDto extends BaseDtoBean {
    /**
     *
     */
    private Long id;

    /**
     * 微信用户昵称
     */
    private String wxnickname;

    /**
     * 微信用户头像图片的 URL
     */
    private String pic;

    /**
     * 微信用户性别 0:未知 1、男性 2、女性
     */
    private Integer gender;

    /**
     * 微信用户所在国家
     */
    private String country;

    /**
     * 微信用户所在省
     */
    private String province;

    /**
     * 微信用户所在市
     */
    private String city;

    /**
     * 微信显示 country，province，city 所用的语言(en:英文 zh_CN:简体中文 zh_TW:繁体中文)
     */
    private Integer language;

    /**
     * 小程序封面照片
     */
    private String coverPhoto;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 小程序用户唯一id
     */
    private String unionId;

    /**
     * 自我介绍
     */
    private String selfIntroduction;

    /**
     * 用户昵称(默认为默认字段，获取微信后更新为微信的，如果修改后，下次则加载该数据)
     */
    private String nickname;

    /**
     * 用户所处行业
     */
    private String userIndustry;

    /**
     * 用户所处职位
     */
    private String userPosition;

    /**
     * 用户所处公司
     */
    private String userWorkCompany;

    /**
     * 毕业院校
     */
    private String graduateSchool;

    /**
     * 学历
     */
    private String recordOfSchool;

    /**
     * 当前所在省
     */
    private String currentProvince;

    /**
     * 当前所在市
     */
    private String currentCity;

    /**
     * 家乡所在省
     */
    private String homeProvince;

    /**
     * 家乡所在市
     */
    private String homeCity;

    /**
     * 情感状态:0、不选 1、单身 2、恋爱中 3、已婚 4、离异 5、丧偶
     */
    private Integer emotionalState;

    /**
     * 用户星座
     */
    private String userConstellation;

    /**
     * 用户出生日期
     */
    private String dateOfBirth;

    /**
     * 用户年龄(后台自动计算)
     */
    private Integer age;

    /**
     * 民族
     */
    private String national;

    /**
     * 信仰
     */
    private String faith;

    /**
     * 属相
     */
    private String animalSign;

    /**
     * 体重
     */
    private Short weight;

    /**
     * 身高
     */
    private Short height;

    /**
     * 血型 0、不选 1、A型 2、B型 3、AB型 4、O型
     */
    private Integer bloodType;

    /**
     * 用户信息的完整度
     */
    private BigDecimal infointegrity;

    /**
     * 用户自己的专属邀请码
     */
    private String inviteCode;

    /**
     * 真实姓名
     */
    private String userName;

    /**
     * key
     */
    private String token;

    /**
     * 注册类型
     */
    private String registerType;

    /**
     * 注册成功渠道可能是邀请码
     */
    private String registrationCode;

    /**
     * 是否显示:0不展示1、展示
     */
    private Integer isShow;

    /**
     * 密码
     */
    private String pass;

    /**
     * 设备唯一标识
     */
    private String imei;

    /**
     * 渠道号
     */
    private String channelId;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 版本
     */
    private String version;

    /**
     * 设备类型
     */
    private String devType;

    /**
     * 注册ip
     */
    private String registerIp;

    /**
     * 邀请人id
     */
    private Integer inviterId;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 用户权限  0.注册用户 1.admin
     */
    private Integer userPower;

    /**
     * 用户-小程序openid
     */
    private String openId;

    /**
     * 用户-服务号openid
     */
    private String gzhOpenId;

    /**
     *
     */
    private Integer platform;

    /**
     * 逻辑删除标识：0-未删除；1-已删除
     */
    private Integer isDeleted;

    /**
     * 创建人工号
     */
    private String createUser;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date modifyTime;

    /**
     * 创建人昵称
     */
    private String createUserName;

    /**
     * 修改人工号
     */
    private String modifyUser;

    /**
     * 修改人昵称
     */
    private String modifyUserName;

    /**
     * 0、未关注 1、已关注
     */
    private Integer isFocusWechatService;

}
