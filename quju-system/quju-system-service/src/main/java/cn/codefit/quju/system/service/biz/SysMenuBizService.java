package cn.codefit.quju.system.service.biz;

import cn.codefit.quju.system.api.dto.SysMenuDto;
import cn.codefit.quju.system.api.vo.SysMenuVo;
import cn.codefit.quju.system.model.po.SysMenu;

import java.util.List;

/**
 *
 */
public interface SysMenuBizService {

    /**
     * 根据条件查询菜单信息
     *
     * @param param
     * @return
     */
    List<SysMenuDto> querySysMenuList(SysMenuVo param);

    /**
     * 根据id查询菜单信息
     *
     * @param id
     * @return
     */
    SysMenu selectSysMenuById(Long id);

    /**
     * 根据id删除菜单层级信息
     *
     * @param id
     */
    void deleteSysMenuById(Long id);


    /**
     * 根据名称查询菜单信息
     *
     * @param name
     * @return
     */
    SysMenu selectSysMenuByName(String name);

    /**
     * 新增一个菜单信息
     *
     * @param sysMenu
     */
    void save(SysMenu sysMenu);

    /**
     * 更新菜单信息
     *
     * @param sysMenu
     */
    void updateSysMenu(SysMenu sysMenu);

    /**
     * 用户登录成功后获取其菜单结构
     *
     * @return
     */
    List<SysMenuDto> getUserRoleMenuList(SysMenuVo param);

    /**
     * 根据角色id查询角色关联的菜单数据
     *
     * @param roleId
     * @return
     */
    List<SysMenuDto> querySysMenuListByRoleId(Long roleId);

    /**
     * 刷新redis中缓存的角色-权限关联关系数据
     */
    void refreshRoleMenusData();

    /**
     * 获取角色拥有的资源列表(新增角色时候使用)
     *
     * @param roleId 角色ID
     * @return
     */
    List<Long> selectMenuIdsByRoleId(Long roleId);

    /**
     * 注意菜单名称是否重复
     *
     * @param name   菜单名称
     * @param menuId 菜单id
     * @return
     */
    boolean checkSysMenuName(String name, Long menuId);
}
