
import controller.CarController;
import controller.OrderController;
import db.CarDataBase;
import db.OrderDataBase;
import db.impl.CarDataBaseImpl;
import db.impl.OrderDataBaseImpl;
import entity.Car;
import mapper.CarMapper;
import mapper.OrderMapper;
import mapper.impl.CarMapperImpl;
import mapper.impl.OrderMapperImpl;
import repository.CarRepository;
import repository.OrderRepository;
import repository.impl.CarRepositoryImpl;
import repository.impl.OrderRepositoryImpl;
import sequence.Sequence;
import sequence.impl.CarSequence;
import sequence.impl.OrderSequence;
import service.CarService;
import service.CrudImpl;
import service.OrderService;
import service.impl.CarServiceImpl;
import service.impl.OrderServiceImpl;
import view.View;
import view.ViewOrder;

import java.util.HashMap;
import java.util.Scanner;

public class Main
    {

        public static void main(String[] args)
            {
                Sequence sequence = new CarSequence();
                CarMapper carMapper = new CarMapperImpl();
                CarDataBase carDataBase = new CarDataBaseImpl();
                CarRepository carRepository = new CarRepositoryImpl(carDataBase,sequence,carMapper);
                CarService carService = new CarServiceImpl(carRepository);
                CarController carController = new CarController(carService);

                Sequence sequenceOrder = new OrderSequence();
                OrderMapper orderMapper = new OrderMapperImpl();
                OrderDataBase orderDataBase = new OrderDataBaseImpl();
                OrderRepository orderRepository = new OrderRepositoryImpl(orderDataBase,orderMapper,sequenceOrder);
                OrderService orderService = new OrderServiceImpl(orderRepository);
                OrderController orderController = new OrderController(orderService);






                ViewOrder view = new ViewOrder(orderController);

                view.start();

            }
    }
