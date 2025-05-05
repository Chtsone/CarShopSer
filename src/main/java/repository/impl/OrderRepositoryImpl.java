package repository.impl;

import db.OrderDataBase;
import entity.Order;
import mapper.OrderMapper;
import repository.OrderRepository;

import java.util.List;

public class OrderRepositoryImpl implements OrderRepository
    {
        private OrderDataBase orders;
        private OrderMapper orderMapper;
        @Override
        public List<Order> findAll()
            {
                return List.of();
            }

        @Override
        public Order findById(int id)
            {
                return null;
            }

        @Override
        public Order save(Order car)
            {
                return null;
            }

        @Override
        public void deleteById(int id)
            {

            }
    }
