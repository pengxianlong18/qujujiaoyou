package cn.codefit.quju.system.service.biz.impl;

import cn.codefit.base.redis.util.RedisUtil;
import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.base.enums.ConstantEnum;
import cn.codefit.quju.base.enums.PlatformEnum;
import cn.codefit.quju.base.util.UserUtils;
import cn.codefit.quju.system.api.dto.SysMenuDto;
import cn.codefit.quju.system.api.dto.SysRoleDto;
import cn.codefit.quju.system.api.vo.SysMenuVo;
import cn.codefit.quju.system.api.vo.SysRoleVo;
import cn.codefit.quju.system.model.dao.SysMenuMapper;
import cn.codefit.quju.system.model.po.SysMenu;
import cn.codefit.quju.system.model.po.SysMenuExample;
import cn.codefit.quju.system.model.po.SysRoleMenu;
import cn.codefit.quju.system.service.biz.SysMenuBizService;
import cn.codefit.quju.system.service.biz.SysRoleBizService;
import cn.codefit.quju.system.service.biz.dao.SysMenuBizMapper;
import cn.codefit.quju.system.service.util.SysUtils;
import cn.hutool.core.bean.BeanUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
public class SysMenuBizServiceImpl implements SysMenuBizService {
    @Autowired
    private SysMenuMapper sysMenuMapper;
    @Autowired
    private SysMenuBizMapper sysMenuBizMapper;
    @Autowired
    private SysRoleBizService sysRoleBizService;
    @Autowired
    private RedisUtil redisUtil;

    /**
     * 根据条件查询菜单信息
     *
     * @param param
     * @return
     */
    @Override
    public List<SysMenuDto> querySysMenuList(SysMenuVo param) {
        Map<String, Object> map = BeanUtil.copyProperties(param, Map.class);
        List<SysMenuDto> list = sysMenuBizMapper.selectByCondition(map);
        return list;
    }

    /**
     * 根据id查询菜单信息
     *
     * @param id
     * @return
     */
    @Override
    public SysMenu selectSysMenuById(Long id) {
        return sysMenuMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据id删除菜单层级信息
     *
     * @param id
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void deleteSysMenuById(Long id) {
        //删除菜单
        sysMenuMapper.deleteByPrimaryKey(id);
        //删除角色-菜单关联关系
        sysRoleBizService.deleteRoleMenuById(id, 1);
        refreshRoleMenusData();
    }

    /**
     * 根据名称查询菜单信息
     *
     * @param name
     * @return
     */
    @Override
    public SysMenu selectSysMenuByName(String name) {
        SysMenuExample example = new SysMenuExample();
        SysMenuExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(name);

        List<SysMenu> list = sysMenuMapper.selectByExample(example);

        return list.size() > 0 ? list.get(0) : null;
    }

    /**
     * 新增一个菜单信息
     *
     * @param sysMenu
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(SysMenu sysMenu) {
        sysMenu.setCreateTime(new Date());
        sysMenu.setCreateUser(UserUtils.getUserId().toString());
        sysMenu.setCreateUserName(UserUtils.getUsername());
        sysMenu.setIsDeleted(ConstantEnum.IS_DELETE_NO.getCode());
        sysMenu.setPlatform(PlatformEnum.PLATEFORM_0.getCode());
        sysMenuMapper.insert(sysMenu);
        refreshRoleMenusData();
    }

    /**
     * 更新菜单信息
     *
     * @param sysMenu
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void updateSysMenu(SysMenu sysMenu) {

        sysMenu.setModifyTime(new Date());
        sysMenu.setModifyUser(UserUtils.getUserId().toString());
        sysMenu.setModifyUserName(UserUtils.getUsername());
        sysMenuMapper.updateByPrimaryKeySelective(sysMenu);
        refreshRoleMenusData();
    }


    /**
     * 根据角色id查询角色关联的菜单数据
     *
     * @param roleId
     * @return
     */
    @Override
    public List<SysMenuDto> querySysMenuListByRoleId(Long roleId) {
        List<SysMenuDto> menuDtos = new ArrayList<>();
        List<SysRoleMenu> sysRoleMenus = sysRoleBizService.getSysSysRoleMenu(roleId, 1);
        if (sysRoleMenus.size() > 0) {
            //先查询目录和菜单数据
            SysMenuVo sysMenuVo = new SysMenuVo();
            List<Long> menuIds = sysRoleMenus.stream().map(SysRoleMenu::getMenuId).collect(Collectors.toList());
            sysMenuVo.setMenuIds(menuIds);
            menuDtos = querySysMenuList(sysMenuVo);
        }
        return menuDtos;
    }

    /**
     * 用户登录成功后获取其菜单结构
     *
     * @return
     */
    @Override
    public List<SysMenuDto> getUserRoleMenuList(SysMenuVo param) {
        String roleCode = UserUtils.getRoleCode();
        if (StringUtils.isBlank(roleCode)) {
            return new ArrayList<>();
        }
        List<SysRoleMenu> sysRoleMenus = sysRoleBizService.getSysSysRoleMenuByRoleCode(roleCode);
        if (sysRoleMenus.size() == 0) {
            return new ArrayList<>();
        }
        List<Long> menuIds = sysRoleMenus.stream().map(SysRoleMenu::getMenuId).collect(Collectors.toList());
        param.setMenuIds(menuIds);
        //先查询目录和菜单数据
        List<SysMenuDto> list = querySysMenuList(param);
        List<SysMenuDto> listRt = SysUtils.generateRecurMenus(list);

        param.setType(2);
        param.setTypes(null);
        List<SysMenuDto> buttonList = querySysMenuList(param);

        if (listRt.size() > 0) {
            //加载权限
            list.forEach(item -> {
                List<SysMenuDto> child = item.getChildren();
                child.forEach(itemChild -> {
//                    List<String> permList=getMenuPerm(itemChild.getId(),roleCode);
                    List<String> permList = buttonList.stream().filter(button -> button.getParentId().equals(itemChild.getId())).map(SysMenuDto::getPerms).collect(Collectors.toList());
                    itemChild.setPermList(permList);
                });
            });
        }
        return listRt;
    }

    /**
     * 获取用户某个菜单下的权限数据
     *
     * @param id       父级id
     * @param roleCode 角色编码
     * @return
     */
    private List<String> getMenuPerm(Long id, String roleCode) {
        SysMenuExample example = new SysMenuExample();
        SysMenuExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(id);
        criteria.andTypeEqualTo(2);
        List<SysMenu> list = sysMenuMapper.selectByExample(example);
        if (list.size() == 0) {
            return new ArrayList<>();
        }

        return list.stream().map(SysMenu::getPerms).collect(Collectors.toList());
    }

    /**
     * 刷新redis中缓存的角色-权限关联关系数据
     */
    @Override
    public void refreshRoleMenusData() {
        String key = Constant.REDIS_HASH_ROLE_MENU_KEY;
        redisUtil.delete(key);

        SysRoleVo param = new SysRoleVo();
        param.setStatus(Constant.STATUS_ENABLE);
        List<SysRoleDto> list = sysRoleBizService.querySysRoleListNoPage(param);

        Map<String, String> roleMenesData = new HashMap<>();

        if (list.size() > 0) {
            list.forEach(item -> {
                //角色-可请求的接口路径地址
                String menu = "";
                //获取角色关联的菜单数据
                List<SysMenuDto> sysMenuDtos = querySysMenuListByRoleId(item.getId());
                if (sysMenuDtos.size() > 0) {
                    menu = sysMenuDtos.stream().map(SysMenuDto::getUrlPerm).distinct().collect(Collectors.joining(","));
                }
                roleMenesData.put(item.getCode(), menu);
            });
            redisUtil.hPutAll(key, roleMenesData);
        }
    }

    /**
     * 获取角色拥有的资源列表(新增角色时候使用)
     *
     * @param roleId 角色ID
     * @return
     */
    @Override
    public List<Long> selectMenuIdsByRoleId(Long roleId) {
        List<SysMenuDto> sysMenuDtos = querySysMenuListByRoleId(roleId);
        if (sysMenuDtos.size() == 0) {
            return new ArrayList<>();
        }
        return sysMenuDtos.stream().map(SysMenuDto::getId).collect(Collectors.toList());
    }

    /**
     * 注意菜单名称是否重复
     *
     * @param name   菜单名称
     * @param menuId 菜单id
     * @return
     */
    @Override
    public boolean checkSysMenuName(String name, Long menuId) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        if (menuId != null) {
            map.put("noId", menuId);
        }
        int number = sysMenuBizMapper.checkSysMenuName(map);
        return number > 0 ? true : false;
    }
}
