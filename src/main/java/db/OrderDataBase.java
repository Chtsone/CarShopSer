package db;

import entity.Order;

import java.util.Map;

public interface OrderDataBase
    {
        Map<Integer, Order> getOrdersMap();

    }
