package cn.codefit.quju.system.service.biz.impl;

import cn.codefit.quju.base.enums.ConstantEnum;
import cn.codefit.quju.base.enums.PlatformEnum;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.base.util.UserUtils;
import cn.codefit.quju.system.api.dto.SysRoleDto;
import cn.codefit.quju.system.api.vo.SysRoleVo;
import cn.codefit.quju.system.model.dao.SysRoleMapper;
import cn.codefit.quju.system.model.dao.SysRoleMenuMapper;
import cn.codefit.quju.system.model.dao.SysUserRoleMapper;
import cn.codefit.quju.system.model.po.SysRole;
import cn.codefit.quju.system.model.po.SysRoleExample;
import cn.codefit.quju.system.model.po.SysRoleMenu;
import cn.codefit.quju.system.model.po.SysRoleMenuExample;
import cn.codefit.quju.system.model.po.SysUserRole;
import cn.codefit.quju.system.model.po.SysUserRoleExample;
import cn.codefit.quju.system.service.biz.SysMenuBizService;
import cn.codefit.quju.system.service.biz.SysRoleBizService;
import cn.codefit.quju.system.service.biz.dao.SysRoleBizMapper;
import cn.hutool.core.bean.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 */
@Service
public class SysRoleBizServiceImpl implements SysRoleBizService {
    @Autowired
    private SysRoleBizMapper sysRoleBizMapper;
    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Autowired
    private SysRoleMenuMapper sysRoleMenuMapper;
    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;
    @Autowired
    private SysMenuBizService sysMenuBizService;

    /**
     * 分页获取角色列表
     *
     * @return
     */
    @Override
    public CommonResponse<List<SysRoleDto>> querySysRoleList(SysRoleVo param) {
        Map<String, Object> map = BeanUtil.copyProperties(param, Map.class);
        map.put("isDeleted", ConstantEnum.IS_DELETE_NO.getCode());
        int pageNum = param.getPageNum();
        int pageSize = param.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<SysRoleDto> list = sysRoleBizMapper.selectByCondition(map);
        PageInfo<SysRoleDto> pageInfo = new PageInfo(list);
        int count = Integer.parseInt(String.valueOf(pageInfo.getTotal()));
        if (CollectionUtils.isEmpty(list)) {
            return CommonResponse.success(new PageInfo<>(new ArrayList<>()));
        }
        return CommonResponse.success(pageInfo);
    }

    /**
     * 不分页查询角色数据
     *
     * @param param
     * @return
     */
    @Override
    public List<SysRoleDto> querySysRoleListNoPage(SysRoleVo param) {
        Map<String, Object> map = BeanUtil.copyProperties(param, Map.class);
        map.put("isDeleted", ConstantEnum.IS_DELETE_NO.getCode());
        List<SysRoleDto> list = sysRoleBizMapper.selectByCondition(map);
        return list;
    }

    /**
     * 保存角色信息
     *
     * @param sysRole
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(SysRole sysRole) {
        sysRole.setCreateTime(new Date());
        sysRole.setCreateUser(UserUtils.getUserId().toString());
        sysRole.setCreateUserName(UserUtils.getUsername());
        sysRole.setDeleted(ConstantEnum.IS_DELETE_NO.getCode());
        sysRole.setIsDeleted(ConstantEnum.IS_DELETE_NO.getCode());
        sysRole.setPlatform(PlatformEnum.PLATEFORM_0.getCode());
        sysRoleMapper.insert(sysRole);
    }

    /**
     * 修改角色信息
     *
     * @param sysRole
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateSysRole(SysRole sysRole) {
        sysRole.setModifyTime(new Date());
        sysRole.setModifyUser(UserUtils.getUserId().toString());
        sysRole.setModifyUserName(UserUtils.getUsername());
        sysRoleMapper.updateByPrimaryKeySelective(sysRole);
    }

    /**
     * 根据角色编码获取角色信息
     *
     * @param code
     * @return
     */
    @Override
    public SysRole getSysRoleByRoleCode(String code) {
        SysRoleExample example = new SysRoleExample();
        SysRoleExample.Criteria criteria = example.createCriteria();
        criteria.andCodeEqualTo(code);

        List<SysRole> list = sysRoleMapper.selectByExample(example);

        return list.size() > 0 ? list.get(0) : null;
    }

    /**
     * 根据角色id获取角色信息
     *
     * @param id
     * @return
     */
    @Override
    public SysRole getSysRoleByRoleId(Long id) {
        return sysRoleMapper.selectByPrimaryKey(id);
    }

    /**
     * 给角色分配权限
     *
     * @param id      角色id
     * @param menuIds 菜单id列表
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void allotPerms(Long id, List<Long> menuIds) {
        //删除历史绑定关系
        deleteRoleMenuById(id, 0);
        //重新绑定
        for (int i = 0; i < menuIds.size(); i++) {
            SysRoleMenu sysRoleMenu = new SysRoleMenu();
            sysRoleMenu.setRoleId(id);
            sysRoleMenu.setMenuId(menuIds.get(i));
            saveSysRoleMenu(sysRoleMenu);
        }
        sysMenuBizService.refreshRoleMenusData();
    }

    /**
     * 根据菜单id或者角色id删除关联关系
     *
     * @param id
     * @param type 0、通过角色id  1、通过菜单id
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteRoleMenuById(Long id, int type) {
        SysRoleMenuExample example = new SysRoleMenuExample();
        SysRoleMenuExample.Criteria criteria = example.createCriteria();
        if (type == 0) {
            criteria.andRoleIdEqualTo(id);
        } else {
            criteria.andMenuIdEqualTo(id);
        }
        sysRoleMenuMapper.deleteByExample(example);
        sysMenuBizService.refreshRoleMenusData();
    }

    /**
     * 保存角色菜单关联关系
     *
     * @param sysRoleMenu
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void saveSysRoleMenu(SysRoleMenu sysRoleMenu) {
        sysRoleMenuMapper.insert(sysRoleMenu);
        sysMenuBizService.refreshRoleMenusData();
    }

    /**
     * 根据用户id获取关联的角色信息
     *
     * @param userId
     * @return
     */
    @Override
    public List<SysRole> getSysRoleByUserId(Long userId) {
        List<SysUserRole> sysUserRoles = getSysUserRole(userId, 0);
        if (sysUserRoles.size() == 0) {
            return new ArrayList<>();
        }
        List<Long> roleIds = sysUserRoles.stream().map(SysUserRole::getRoleId).collect(Collectors.toList());
        SysRoleExample sysRoleExample = new SysRoleExample();
        SysRoleExample.Criteria criteria = sysRoleExample.createCriteria();
        criteria.andIdIn(roleIds);
        criteria.andIsDeletedEqualTo(0);

        List<SysRole> list = sysRoleMapper.selectByExample(sysRoleExample);
        return list;
    }

    /**
     * 根据用户id或角色id获取用户角色关联关系
     *
     * @param id
     * @param type 0、根据用户id  1、根据角色id
     * @return
     */
    @Override
    public List<SysUserRole> getSysUserRole(Long id, Integer type) {
        SysUserRoleExample example = new SysUserRoleExample();
        SysUserRoleExample.Criteria criteria = example.createCriteria();
        if (type == 0) {
            criteria.andUserIdEqualTo(id);
        } else {
            criteria.andRoleIdEqualTo(id);
        }
        List<SysUserRole> list = sysUserRoleMapper.selectByExample(example);
        return list;
    }

    /**
     * 获取角色和菜单以及权限的关联关系
     *
     * @param id
     * @param type 0、根据菜单id  1、根据角色id
     * @return
     */
    @Override
    public List<SysRoleMenu> getSysSysRoleMenu(Long id, int type) {
        SysRoleMenuExample example = new SysRoleMenuExample();
        SysRoleMenuExample.Criteria criteria = example.createCriteria();
        if (type == 0) {
            criteria.andMenuIdEqualTo(id);
        } else {
            criteria.andRoleIdEqualTo(id);
        }
        List<SysRoleMenu> list = sysRoleMenuMapper.selectByExample(example);
        return list;
    }

    /**
     * 获取角色编码获取与权限的关联关系
     *
     * @param roleCode
     * @return
     */
    @Override
    public List<SysRoleMenu> getSysSysRoleMenuByRoleCode(String roleCode) {
        SysRole sysRole = getSysRoleByRoleCode(roleCode);
        if (sysRole == null) {
            return new ArrayList<>();
        }
        SysRoleMenuExample example = new SysRoleMenuExample();
        SysRoleMenuExample.Criteria criteria = example.createCriteria();
        criteria.andRoleIdEqualTo(sysRole.getId());
        List<SysRoleMenu> list = sysRoleMenuMapper.selectByExample(example);
        return list;
    }

    /**
     * 判断角色编码不能重复
     *
     * @param code   角色编码
     * @param roleId 角色id
     * @return
     */
    @Override
    public boolean checkSysRoleCode(String code, Long roleId) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", code);
        if (roleId != null) {
            map.put("noId", roleId);
        }
        int number = sysRoleBizMapper.checkSysRoleCode(map);
        return number > 0 ? true : false;
    }

    /**
     * 删除角色
     *
     * @param id 角色id
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteRoleByRoleId(Long id) {
        //1、删除角色
        sysRoleMapper.deleteByPrimaryKey(id);
        //2、删除角色-菜单权限的绑定关系
        deleteRoleMenuById(id, 0);

    }
}
