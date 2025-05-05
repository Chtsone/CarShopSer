package db.impl;

import db.OrderDataBase;
import entity.Order;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class OrderDataBaseImpl implements OrderDataBase
    {
        private final Map<Integer, Order> orders;  // TODO именно здесь создать f в конструкторе

        public OrderDataBaseImpl()
            {
                this.orders = new HashMap<Integer, Order>();
                IntStream
                        .range(0, 100).
                        forEach(i ->
                                orders.put(
                                        i, new Order(
                                                "name %d".formatted(i), i, LocalDate.of(
                                                2024, 1, 10), "status %d".formatted(i))));

            }

        @Override
        public Map<Integer, Order> getOrders()
            {
                return orders;
            }
    }
