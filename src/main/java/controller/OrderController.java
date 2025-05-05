package controller;

import entity.Car;
import entity.Order;
import service.CarService;
import service.OrderService;

import java.util.List;

public class OrderController
    {
        OrderService orderService;

        public OrderController(OrderService orderService)
            {
                this.orderService = orderService;
            }

        public List<Order> findAll()
            {
                return orderService.findAll();
            }

        public Order findById(int id)
            {
                return orderService.findById(id);
            }


        public Order save(Order order)
            {
                return orderService.save(order);
            }

        public void update(int id, Order order)
            {
                orderService.update(id, order);
            }
        public void deleteById(int id)
            {
                orderService.deleteById(id);
            }
    }
