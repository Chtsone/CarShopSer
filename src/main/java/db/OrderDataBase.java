package db;

import entity.Car;
import entity.Order;

import java.util.Map;

public interface OrderDataBase
    {
        Map<Integer, Order> getOrders();

    }
