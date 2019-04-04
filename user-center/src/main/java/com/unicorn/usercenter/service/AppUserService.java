package com.unicorn.usercenter.service;

import com.unicorn.common.model.common.Page;
import com.unicorn.common.model.user.AppUser;
import com.unicorn.common.model.user.LoginAppUser;
import com.unicorn.common.model.user.SysRole;

import java.util.Map;
import java.util.Set;


public interface AppUserService {

    void addAppUser(AppUser appUser);

    void updateAppUser(AppUser appUser);

    LoginAppUser findByUsername(String username);

    AppUser findById(Long id);

    void setRoleToUser(Long id, Set<Long> roleIds);

    void updatePassword(Long id, String oldPassword, String newPassword);

    Page<AppUser> findUsers(Map<String, Object> params);

    Set<SysRole> findRolesByUserId(Long userId);

    void bindingPhone(Long userId, String phone);
}
