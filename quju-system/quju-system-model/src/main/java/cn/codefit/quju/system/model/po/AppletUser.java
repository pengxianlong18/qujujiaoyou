package cn.codefit.quju.system.model.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AppletUser implements Serializable {
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
     * 状态：0、正常(true) 1、禁用(否)
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

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWxnickname() {
        return wxnickname;
    }

    public void setWxnickname(String wxnickname) {
        this.wxnickname = wxnickname == null ? null : wxnickname.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public String getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto == null ? null : coverPhoto.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId == null ? null : unionId.trim();
    }

    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction == null ? null : selfIntroduction.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getUserIndustry() {
        return userIndustry;
    }

    public void setUserIndustry(String userIndustry) {
        this.userIndustry = userIndustry == null ? null : userIndustry.trim();
    }

    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition == null ? null : userPosition.trim();
    }

    public String getUserWorkCompany() {
        return userWorkCompany;
    }

    public void setUserWorkCompany(String userWorkCompany) {
        this.userWorkCompany = userWorkCompany == null ? null : userWorkCompany.trim();
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool == null ? null : graduateSchool.trim();
    }

    public String getRecordOfSchool() {
        return recordOfSchool;
    }

    public void setRecordOfSchool(String recordOfSchool) {
        this.recordOfSchool = recordOfSchool == null ? null : recordOfSchool.trim();
    }

    public String getCurrentProvince() {
        return currentProvince;
    }

    public void setCurrentProvince(String currentProvince) {
        this.currentProvince = currentProvince == null ? null : currentProvince.trim();
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity == null ? null : currentCity.trim();
    }

    public String getHomeProvince() {
        return homeProvince;
    }

    public void setHomeProvince(String homeProvince) {
        this.homeProvince = homeProvince == null ? null : homeProvince.trim();
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String homeCity) {
        this.homeCity = homeCity == null ? null : homeCity.trim();
    }

    public Integer getEmotionalState() {
        return emotionalState;
    }

    public void setEmotionalState(Integer emotionalState) {
        this.emotionalState = emotionalState;
    }

    public String getUserConstellation() {
        return userConstellation;
    }

    public void setUserConstellation(String userConstellation) {
        this.userConstellation = userConstellation == null ? null : userConstellation.trim();
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth == null ? null : dateOfBirth.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national == null ? null : national.trim();
    }

    public String getFaith() {
        return faith;
    }

    public void setFaith(String faith) {
        this.faith = faith == null ? null : faith.trim();
    }

    public String getAnimalSign() {
        return animalSign;
    }

    public void setAnimalSign(String animalSign) {
        this.animalSign = animalSign == null ? null : animalSign.trim();
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public Short getHeight() {
        return height;
    }

    public void setHeight(Short height) {
        this.height = height;
    }

    public Integer getBloodType() {
        return bloodType;
    }

    public void setBloodType(Integer bloodType) {
        this.bloodType = bloodType;
    }

    public BigDecimal getInfointegrity() {
        return infointegrity;
    }

    public void setInfointegrity(BigDecimal infointegrity) {
        this.infointegrity = infointegrity;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType == null ? null : registerType.trim();
    }

    public String getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode == null ? null : registrationCode.trim();
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass == null ? null : pass.trim();
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getDevType() {
        return devType;
    }

    public void setDevType(String devType) {
        this.devType = devType == null ? null : devType.trim();
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
    }

    public Integer getInviterId() {
        return inviterId;
    }

    public void setInviterId(Integer inviterId) {
        this.inviterId = inviterId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public Integer getUserPower() {
        return userPower;
    }

    public void setUserPower(Integer userPower) {
        this.userPower = userPower;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getGzhOpenId() {
        return gzhOpenId;
    }

    public void setGzhOpenId(String gzhOpenId) {
        this.gzhOpenId = gzhOpenId == null ? null : gzhOpenId.trim();
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public String getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(String modifyUser) {
        this.modifyUser = modifyUser == null ? null : modifyUser.trim();
    }

    public String getModifyUserName() {
        return modifyUserName;
    }

    public void setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName == null ? null : modifyUserName.trim();
    }

    public Integer getIsFocusWechatService() {
        return isFocusWechatService;
    }

    public void setIsFocusWechatService(Integer isFocusWechatService) {
        this.isFocusWechatService = isFocusWechatService;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", wxnickname=").append(wxnickname);
        sb.append(", pic=").append(pic);
        sb.append(", gender=").append(gender);
        sb.append(", country=").append(country);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", language=").append(language);
        sb.append(", coverPhoto=").append(coverPhoto);
        sb.append(", mobile=").append(mobile);
        sb.append(", unionId=").append(unionId);
        sb.append(", selfIntroduction=").append(selfIntroduction);
        sb.append(", nickname=").append(nickname);
        sb.append(", userIndustry=").append(userIndustry);
        sb.append(", userPosition=").append(userPosition);
        sb.append(", userWorkCompany=").append(userWorkCompany);
        sb.append(", graduateSchool=").append(graduateSchool);
        sb.append(", recordOfSchool=").append(recordOfSchool);
        sb.append(", currentProvince=").append(currentProvince);
        sb.append(", currentCity=").append(currentCity);
        sb.append(", homeProvince=").append(homeProvince);
        sb.append(", homeCity=").append(homeCity);
        sb.append(", emotionalState=").append(emotionalState);
        sb.append(", userConstellation=").append(userConstellation);
        sb.append(", dateOfBirth=").append(dateOfBirth);
        sb.append(", age=").append(age);
        sb.append(", national=").append(national);
        sb.append(", faith=").append(faith);
        sb.append(", animalSign=").append(animalSign);
        sb.append(", weight=").append(weight);
        sb.append(", height=").append(height);
        sb.append(", bloodType=").append(bloodType);
        sb.append(", infointegrity=").append(infointegrity);
        sb.append(", inviteCode=").append(inviteCode);
        sb.append(", userName=").append(userName);
        sb.append(", token=").append(token);
        sb.append(", registerType=").append(registerType);
        sb.append(", registrationCode=").append(registrationCode);
        sb.append(", isShow=").append(isShow);
        sb.append(", pass=").append(pass);
        sb.append(", imei=").append(imei);
        sb.append(", channelId=").append(channelId);
        sb.append(", mail=").append(mail);
        sb.append(", version=").append(version);
        sb.append(", devType=").append(devType);
        sb.append(", registerIp=").append(registerIp);
        sb.append(", inviterId=").append(inviterId);
        sb.append(", idCard=").append(idCard);
        sb.append(", userPower=").append(userPower);
        sb.append(", openId=").append(openId);
        sb.append(", gzhOpenId=").append(gzhOpenId);
        sb.append(", platform=").append(platform);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", createUserName=").append(createUserName);
        sb.append(", modifyUser=").append(modifyUser);
        sb.append(", modifyUserName=").append(modifyUserName);
        sb.append(", isFocusWechatService=").append(isFocusWechatService);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
