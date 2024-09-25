package cn.codefit.quju.system.service.service.impl;


import cn.codefit.quju.base.constant.Constant;
import cn.codefit.quju.base.enums.ResponseCode;
import cn.codefit.quju.base.model.DropOption;
import cn.codefit.quju.base.rpc.CommonResponse;
import cn.codefit.quju.system.api.dto.SysRoleDto;
import cn.codefit.quju.system.api.service.SysRoleService;
import cn.codefit.quju.system.api.vo.SysRoleVo;
import cn.codefit.quju.system.model.po.SysRole;
import cn.codefit.quju.system.service.biz.SysRoleBizService;
import cn.hutool.core.bean.BeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 角色业务接口
 */
@DubboService(version = Constant.VERSION, interfaceClass = SysRoleService.class)
@RequestMapping(value = "/role")
@RestController
@Slf4j
public class SysRoleServiceImpl implements SysRoleService {


    @Autowired
    private SysRoleBizService sysRoleBizService;

    /**
     * 分页获取角色列表
     *
     * @return
     */
    @Override
    @PostMapping(value = "/querySysRoleList")
    public CommonResponse<List<SysRoleDto>> querySysRoleList(@RequestBody SysRoleVo param) {
        return sysRoleBizService.querySysRoleList(param);
    }

    /**
     * 新增或修改角色
     *
     * @param param
     * @return
     */
    @Override
    @RequestMapping(value = "/addOrUpdateRole", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public CommonResponse<Boolean> addOrUpdateRole(@RequestBody SysRoleVo param) {
        if (param == null) {
            return CommonResponse.error(ResponseCode.ILLEGAL_ARGUMENT);
        }
        try {
            Long id = param.getId();
            SysRole SysRole = BeanUtil.copyProperties(param, SysRole.class);
            //1、 判断角色编码不能重复
            boolean result = sysRoleBizService.checkSysRoleCode(param.getCode(), id);
            if (result) {
                return CommonResponse.error(ResponseCode.MORE_ROLE);
            }
            if (id == null) {
                sysRoleBizService.save(SysRole);
            } else {
                sysRoleBizService.updateSysRole(SysRole);
            }
            return CommonResponse.success(true);

        } catch (Exception e) {
            log.error(ExceptionUtils.getStackTrace(e));
            return CommonResponse.error(ResponseCode.FAIL_COMMON);
        }
    }

    /**
     * 给角色分配权限
     *
     * @param param
     * @return
     */
    @Override
    @RequestMapping(value = "/allotPerms", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public CommonResponse<Boolean> allotPerms(@RequestBody SysRoleVo param) {
        if (param == null || param.getMenuIds() == null) {
            return CommonResponse.error(ResponseCode.ILLEGAL_ARGUMENT);
        }
        sysRoleBizService.allotPerms(param.getId(), param.getMenuIds());
        return CommonResponse.success(true);
    }

    /**
     * 删除角色
     *
     * @param id 角色ID
     * @return
     */
    @Override
    @RequestMapping(value = "/deleteSysRoleById", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public CommonResponse<Boolean> deleteByIds(@RequestParam Long id) {
        sysRoleBizService.deleteRoleByRoleId(id);
        return CommonResponse.success(true);
    }


    /**
     * 新增用户时获取下拉角色数据
     *
     * @return
     */
    @Override
    @RequestMapping(value = "/lisetRoleOptions", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public CommonResponse<List<DropOption>> lisetRoleOptions() {
        List<DropOption> dropOptions = new ArrayList<>();
        SysRoleVo param = new SysRoleVo();
        param.setStatus(Constant.STATUS_ENABLE);
        List<SysRoleDto> list = sysRoleBizService.querySysRoleListNoPage(param);
        if (list.size() > 0) {
            list.forEach(item -> {
                dropOptions.add(new DropOption(item.getId(), item.getName()));
            });
        }
        return CommonResponse.success(dropOptions);
    }
}
