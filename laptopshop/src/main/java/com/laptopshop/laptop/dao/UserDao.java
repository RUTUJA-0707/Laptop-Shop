package com.laptopshop.laptop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.laptopshop.laptop.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
