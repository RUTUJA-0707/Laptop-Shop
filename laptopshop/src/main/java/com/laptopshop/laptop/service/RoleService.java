package com.laptopshop.laptop.service;

import com.laptopshop.laptop.dao.RoleDao;
import com.laptopshop.laptop.entity.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
