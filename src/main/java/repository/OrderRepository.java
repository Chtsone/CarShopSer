package repository;



import entity.Order;

import java.util.List;

public interface OrderRepository
    {
        List<Order> findAll();

        Order findById(int id);

        Order save(Order car);

        void deleteById(int id);
    }
