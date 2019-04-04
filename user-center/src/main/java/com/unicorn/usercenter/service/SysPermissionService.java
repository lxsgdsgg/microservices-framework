package com.unicorn.usercenter.service;

import com.unicorn.common.model.common.Page;
import com.unicorn.common.model.user.SysPermission;

import java.util.Map;
import java.util.Set;


public interface SysPermissionService {

    /**
     * 根绝角色ids获取权限集合
     *
     * @param roleIds
     * @return
     */
    Set<SysPermission> findByRoleIds(Set<Long> roleIds);

    void save(SysPermission sysPermission);

    void update(SysPermission sysPermission);

    void delete(Long id);

    Page<SysPermission> findPermissions(Map<String, Object> params);
}
