package com.gaz.web.spring_boot_v1.service;

import com.gaz.web.spring_boot_v1.entity.Role;

import java.util.List;

public interface RoleService {
    Role getRoleByName(String name);

    Role getRoleById(Long id);

    List<Role> allRoles();

    Role getDefaultRole();
}
