package repository.impl;

import db.OrderDataBase;
import entity.Car;
import entity.Order;
import mapper.OrderMapper;
import repository.OrderRepository;
import sequence.Sequence;
import sequence.impl.OrderSequence;

import java.util.List;

public class OrderRepositoryImpl implements OrderRepository
    {
        private OrderDataBase orders;
        private OrderMapper orderMapper;
        private Sequence orderSequence;

        public OrderRepositoryImpl(OrderDataBase orders, OrderMapper orderMapper, Sequence orderSequence)
            {
                this.orders = orders;
                this.orderMapper = orderMapper;
                this.orderSequence = orderSequence;
            }

        @Override
        public List<Order> findAllToList()
            {
                return orders.getOrdersMap().values().stream().toList();
            }

        @Override
        public Order findById(int id)
            {
                return orders.getOrdersMap().get(id);
            }

        @Override
        public Order save(Order order)
            {
                int id = orderSequence.next();
                orderMapper.fillId(order,id);
                return orders.getOrdersMap().put(order.getId(), order);
            }

        @Override
        public void update(int id, Order order)
            {
                orders.getOrdersMap().put(id, order);
            }

        @Override
        public void deleteById(int id)
            {
                orders.getOrdersMap().remove(id);
            }
    }
