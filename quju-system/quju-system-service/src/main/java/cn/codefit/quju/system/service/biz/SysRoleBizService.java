package cn.codefit.quju.system.service.biz;

import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.system.api.dto.SysRoleDto;
import cn.codefit.quju.system.api.vo.SysRoleVo;
import cn.codefit.quju.system.model.po.SysRole;
import cn.codefit.quju.system.model.po.SysRoleMenu;
import cn.codefit.quju.system.model.po.SysUserRole;

import java.util.List;

/**
 *
 */
public interface SysRoleBizService {

    /**
     * 分页获取角色列表
     *
     * @return
     */
    CommonResponse<List<SysRoleDto>> querySysRoleList(SysRoleVo param);

    /**
     * 保存角色信息
     *
     * @param sysRole
     */
    void save(SysRole sysRole);

    /**
     * 修改角色信息
     *
     * @param sysRole
     */
    void updateSysRole(SysRole sysRole);

    /**
     * 根据角色编码获取角色信息
     *
     * @param code
     * @return
     */
    SysRole getSysRoleByRoleCode(String code);


    /**
     * 根据角色id获取角色信息
     *
     * @param id
     * @return
     */
    SysRole getSysRoleByRoleId(Long id);

    /**
     * 给角色分配权限
     *
     * @param id      角色id
     * @param menuIds 菜单id列表
     */
    void allotPerms(Long id, List<Long> menuIds);

    /**
     * 根据菜单id或者角色id删除关联关系
     *
     * @param id
     * @param type 0、通过角色id  1、通过菜单id
     */
    void deleteRoleMenuById(Long id, int type);

    /**
     * 保存角色菜单关联关系
     *
     * @param sysRoleMenu
     */
    void saveSysRoleMenu(SysRoleMenu sysRoleMenu);

    /**
     * 根据用户id获取关联的角色信息
     *
     * @param userId
     * @return
     */
    List<SysRole> getSysRoleByUserId(Long userId);

    /**
     * 根据用户id或角色id获取用户角色关联关系
     *
     * @param id
     * @param type 0、根据用户id  1、根据角色id
     * @return
     */
    List<SysUserRole> getSysUserRole(Long id, Integer type);

    /**
     * 不分页查询角色数据
     *
     * @param param
     * @return
     */
    List<SysRoleDto> querySysRoleListNoPage(SysRoleVo param);

    /**
     * 获取角色和菜单获取权限的关联关系
     *
     * @param id
     * @param type 0、根据菜单id  1、根据角色id
     * @return
     */
    List<SysRoleMenu> getSysSysRoleMenu(Long id, int type);

    /**
     * 获取角色编码获取与权限的关联关系
     *
     * @param roleCode
     * @return
     */
    List<SysRoleMenu> getSysSysRoleMenuByRoleCode(String roleCode);

    /**
     * 判断角色编码不能重复
     *
     * @param code   角色编码
     * @param roleId 角色id
     * @return
     */
    boolean checkSysRoleCode(String code, Long roleId);

    /**
     * 删除角色
     *
     * @param id 角色id
     */
    void deleteRoleByRoleId(Long id);
}
