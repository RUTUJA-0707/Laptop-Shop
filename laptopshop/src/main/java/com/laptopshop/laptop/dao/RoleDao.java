package com.laptopshop.laptop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.laptopshop.laptop.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
