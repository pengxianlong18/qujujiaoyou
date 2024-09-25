package cn.codefit.quju.system.service.biz.dao;


import cn.codefit.quju.system.api.dto.SysMenuDto;

import java.util.List;
import java.util.Map;

public interface SysMenuBizMapper {

    List<SysMenuDto> selectByCondition(Map<String, Object> map);

    /**
     * 注意菜单名称是否重复
     *
     * @param map
     * @return
     */
    int checkSysMenuName(Map<String, Object> map);
}
