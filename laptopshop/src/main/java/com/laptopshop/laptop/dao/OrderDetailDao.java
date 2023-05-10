package com.laptopshop.laptop.dao;

import org.springframework.data.repository.CrudRepository;

import com.laptopshop.laptop.entity.OrderDetail;
import com.laptopshop.laptop.entity.User;

import java.util.List;

public interface OrderDetailDao extends CrudRepository<OrderDetail, Integer> {
    public List<OrderDetail> findByUser(User user);

    public List<OrderDetail> findByOrderStatus(String status);
}
