package cn.codefit.quju.system.api.service;


import cn.codefit.quju.base.model.DropOption;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.system.api.dto.SysMenuDto;
import cn.codefit.quju.system.api.vo.SysMenuVo;

import java.util.List;

/**
 * 菜单业务接口
 */
public interface SysMenuService {

    /**
     * 不分页获取菜单列表
     *
     * @return
     */
    CommonResponse<List<SysMenuDto>> querySysMenuList(SysMenuVo param);

    /**
     * 新增或修改菜单
     *
     * @param param
     * @return
     */
    CommonResponse<Boolean> saveMenu(SysMenuVo param);

    /**
     * 新增菜单时获取下拉菜单树
     *
     * @return
     */
    CommonResponse<List<DropOption>> querySysMenuDropOption();

    /**
     * 用户登录成功后获取其菜单结构
     *
     * @return
     */
    CommonResponse<List<SysMenuDto>> getUserRoleMenuList();

    /**
     * 删除菜单
     *
     * @param id 菜单ID
     * @return
     */
    CommonResponse<Boolean> deleteByIds(Long id);


    /**
     * 获取角色拥有的资源列表(新增角色时候使用)
     *
     * @param roleId 角色ID
     * @return
     */
    CommonResponse<List<Long>> selectMenuIdsByRoleId(Long roleId);


}
