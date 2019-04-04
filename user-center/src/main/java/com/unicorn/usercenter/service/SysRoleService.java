package com.unicorn.usercenter.service;

import com.unicorn.common.model.common.Page;
import com.unicorn.common.model.user.SysPermission;
import com.unicorn.common.model.user.SysRole;

import java.util.Map;
import java.util.Set;

public interface SysRoleService {

    void save(SysRole sysRole);

    void update(SysRole sysRole);

    void deleteRole(Long id);

    void setPermissionToRole(Long id, Set<Long> permissionIds);

    SysRole findById(Long id);

    Page<SysRole> findRoles(Map<String, Object> params);

    Set<SysPermission> findPermissionsByRoleId(Long roleId);
}
