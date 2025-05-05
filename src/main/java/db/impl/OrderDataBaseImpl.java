package db.impl;

import db.OrderDataBase;
import entity.Order;
import mapper.OrderMapper;
import mapper.impl.OrderMapperImpl;
import sequence.impl.OrderSequence;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class OrderDataBaseImpl implements OrderDataBase
    {
        private  Map<Integer, Order> orders;
        private OrderMapper orderMapper;
        private OrderSequence orderSequence;

        public OrderDataBaseImpl()
            {
                this.orders = new HashMap<>();
                this.orderMapper = new OrderMapperImpl();
                this.orderSequence = new OrderSequence();
                for(int i = 0;i < 100;i++)
                    {
                        Order order = new Order("UserName %d".formatted(i),i,LocalDate.of(2025,10,11),"status %d".formatted(i));
                        int id = orderSequence.next();
                        orderMapper.fillId(order,id);
                        orders.put(order.getId(), order);
                    }

            }

        @Override
        public Map<Integer, Order> getOrdersMap()
            {
                return orders;
            }
    }
