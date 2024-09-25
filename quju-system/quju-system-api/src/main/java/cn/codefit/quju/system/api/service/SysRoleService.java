package cn.codefit.quju.system.api.service;


import cn.codefit.quju.base.model.DropOption;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.system.api.dto.SysRoleDto;
import cn.codefit.quju.system.api.vo.SysRoleVo;

import java.util.List;

/**
 * 角色业务接口层
 */
public interface SysRoleService {

    /**
     * 分页获取角色列表
     *
     * @return
     */
    CommonResponse<List<SysRoleDto>> querySysRoleList(SysRoleVo param);

    /**
     * 新增或修改角色信息
     *
     * @param param
     * @return
     */
    CommonResponse<Boolean> addOrUpdateRole(SysRoleVo param);

    /**
     * 给角色分配权限
     *
     * @param param
     * @return
     */
    CommonResponse<Boolean> allotPerms(SysRoleVo param);

    /**
     * 删除角色
     *
     * @param id 角色ID
     * @return
     */
    CommonResponse<Boolean> deleteByIds(Long id);

    /**
     * 新增用户时获取下拉角色数据
     *
     * @return
     */
    CommonResponse<List<DropOption>> lisetRoleOptions();

}
