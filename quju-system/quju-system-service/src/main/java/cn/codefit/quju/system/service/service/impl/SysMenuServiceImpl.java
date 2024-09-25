package cn.codefit.quju.system.service.service.impl;


import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.base.enums.ResponseCode;
import cn.codefit.quju.base.model.DropOption;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.system.api.dto.SysMenuDto;
import cn.codefit.quju.system.api.service.SysMenuService;
import cn.codefit.quju.system.api.vo.SysMenuVo;
import cn.codefit.quju.system.model.po.SysMenu;
import cn.codefit.quju.system.service.biz.SysMenuBizService;
import cn.codefit.quju.system.service.util.SysUtils;
import cn.hutool.core.bean.BeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * 菜单业务接口
 */
@DubboService(version = Constant.VERSION, interfaceClass = SysMenuService.class)
@RequestMapping(value = "/menu")
@RestController
@Slf4j
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    private SysMenuBizService sysMenuBizService;

    /**
     * 不分页获取菜单列表
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/querySysMenuList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public CommonResponse<List<SysMenuDto>> querySysMenuList(@RequestBody SysMenuVo param) {
        List<SysMenuDto> list = sysMenuBizService.querySysMenuList(param);
        return CommonResponse.success(SysUtils.generateRecurMenus(list));
    }

    /**
     * 新增或修改菜单
     *
     * @param param
     * @return
     */
    @Override
    @RequestMapping(value = "/addOrUpdateMenu", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public CommonResponse<Boolean> saveMenu(@RequestBody SysMenuVo param) {
        if (param == null) {
            return CommonResponse.error(ResponseCode.ILLEGAL_ARGUMENT);
        }
        if (param.getParentId() != Constant.ROOT_MENU_ID && StringUtils.isBlank(param.getUrlPerm())) {
            return CommonResponse.error(ResponseCode.ILLEGAL_ARGUMENT);
        }
        try {
            Long id = param.getId();
            SysMenu sysMenu = BeanUtil.copyProperties(param, SysMenu.class);
            //1、注意菜单名称是否重复
            boolean result = sysMenuBizService.checkSysMenuName(sysMenu.getName(), id);
            if (result) {
                return CommonResponse.error(ResponseCode.MORE_MENU);
            }
            if (id == null) {
                sysMenuBizService.save(sysMenu);
            } else {
                sysMenuBizService.updateSysMenu(sysMenu);
            }
            return CommonResponse.success(true);
        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return CommonResponse.error(ResponseCode.FAIL_COMMON);
        }
    }

    /**
     * 新增菜单时获取下拉菜单树
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/querySysMenuDropOption", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public CommonResponse<List<DropOption>> querySysMenuDropOption() {
        SysMenuVo param = new SysMenuVo();
        param.setTypes(Arrays.asList(0, 1));
        param.setStatus(Constant.STATUS_ENABLE);
        List<SysMenuDto> list = sysMenuBizService.querySysMenuList(param);
        return CommonResponse.success(SysUtils.recurDropMenus(Constant.ROOT_MENU_ID, list));
    }

    /**
     * 用户登录成功后获取其菜单结构
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/getUserRoleMenuList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public CommonResponse<List<SysMenuDto>> getUserRoleMenuList() {
        SysMenuVo param = new SysMenuVo();
        param.setTypes(Arrays.asList(0, 1));
        param.setStatus(Constant.STATUS_ENABLE);
        List<SysMenuDto> list = sysMenuBizService.getUserRoleMenuList(param);
        return CommonResponse.success(list);
    }

    /**
     * 删除菜单
     *
     * @param id 菜单ID
     * @return
     */
    @Override
    @RequestMapping(value = "/deleteSysMenuById", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public CommonResponse<Boolean> deleteByIds(@RequestParam Long id) {
        sysMenuBizService.deleteSysMenuById(id);
        return CommonResponse.success(true);
    }

    /**
     * 获取角色拥有的资源列表(新增角色时候使用)
     *
     * @param roleId 角色ID
     * @return
     */
    @Override
    @RequestMapping(value = "/selectMenuIdsByRoleId", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public CommonResponse<List<Long>> selectMenuIdsByRoleId(@RequestParam Long roleId) {
        List<Long> list = sysMenuBizService.selectMenuIdsByRoleId(roleId);
        return CommonResponse.success(list);
    }
}
