package com.gaz.web.spring_boot_v1.dao;

import com.gaz.web.spring_boot_v1.entity.Role;

import java.util.List;

public interface RoleDao {
    Role getRoleByName(String name);

    Role getRoleById(Long id);

    List<Role> allRoles();

    Role getDefaultRole();
}
