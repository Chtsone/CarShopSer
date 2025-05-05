package service;

import entity.Order;

import java.util.List;

public interface OrderService
    {
        List<Order> findAll();

        Order findById(int id);

        Order save(Order order);

        void update(int id, Order order);

        void  deleteById(int id);
    }
