package cn.codefit.quju.system.service.support;

import cn.codefit.quju.system.service.biz.SysMenuBizService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * 初始化角色-权限数据
 */
@Component
@Slf4j
public class InitRoleMenus implements CommandLineRunner {
    @Autowired
    private SysMenuBizService sysMenuBizService;

    @Override
    public void run(String... args) throws Exception {
        sysMenuBizService.refreshRoleMenusData();
    }
}
