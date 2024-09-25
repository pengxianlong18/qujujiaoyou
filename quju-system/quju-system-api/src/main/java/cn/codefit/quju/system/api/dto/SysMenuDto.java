package cn.codefit.quju.system.api.dto;

import cn.codefit.quju.base.model.BaseDtoBean;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class SysMenuDto extends BaseDtoBean {
    /**
     *
     */
    private Long id;

    /**
     * 父菜单ID
     */
    private Long parentId;

    /**
     * 0、目录;1、菜单;2、按钮
     */
    private Integer type;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 权限标识
     */
    private String perms;

    /**
     * 路由路径
     */
    private String path;

    /**
     * 状态-0、正常(true) 1、禁用(否)
     */
    private Integer status;

    /**
     * 平台
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
     * 创建人昵称
     */
    private String createUserName;

    /**
     * 更新时间
     */
    private Date modifyTime;

    /**
     * 修改人工号
     */
    private String modifyUser;

    /**
     * 修改人昵称
     */
    private String modifyUserName;

    /**
     * 访问路由的默认传递参数
     */
    private String params;

    /**
     * url权限标识
     */
    private String urlPerm;


    @JsonInclude(value = JsonInclude.Include.NON_NULL)
    private List<SysMenuDto> children;

    /**
     * 用户拥有的按钮权限
     */
    private List<String> permList;


}
