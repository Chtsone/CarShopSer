package service.impl;

import entity.Order;
import repository.OrderRepository;
import service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService
    {


        OrderRepository repository;

        public OrderServiceImpl(OrderRepository repository)
            {
                this.repository = repository;
            }

        @Override
        public List<Order> findAll()
            {
                return repository.findAllToList();
            }

        @Override
        public Order findById(int id)
            {
                Order order = repository.findById(id);
                if (order == null) throw new RuntimeException("такого заказа нет");
                return order;
            }

        @Override
        public Order save(Order order)
            {
                return repository.save(order);
            }

        @Override
        public void update(int id, Order order)
            {
                Order byId = repository.findById(id);
                if (order == null) throw new RuntimeException("такого заказа нет");
                repository.update(id, order);
            }

        @Override
        public void deleteById(int id)
            {
                Order order = repository.findById(id);
                if (order == null) throw new RuntimeException("такого заказа нет");
                repository.deleteById(id);
            }
    }
