package repository;



import entity.Car;
import entity.Order;

import java.util.List;

public interface OrderRepository
    {
        List<Order> findAllToList();

        Order findById(int id);

        Order save(Order order);

        void update(int id, Order car);

        void deleteById(int id);
    }
