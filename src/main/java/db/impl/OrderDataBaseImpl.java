package db.impl;

import db.OrderDataBase;
import entity.Car;
import entity.Order;

import java.util.Map;

public class OrderDataBaseImpl implements OrderDataBase
    {
        private Map<Integer, Order> orders;  // TODO именно здесь создать f в конструкторе

        @Override
        public Map<Integer, Order> getOrders()
            {
                return orders;
            }
    }
