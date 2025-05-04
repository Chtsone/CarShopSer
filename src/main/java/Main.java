
import controller.CarController;
import db.CarDataBase;
import db.impl.CarDataBaseImpl;
import entity.Car;
import mapper.CarMapper;
import mapper.impl.CarMapperImpl;
import repository.CarRepository;
import repository.impl.CarRepositoryImpl;
import sequence.Sequence;
import sequence.impl.CarSequence;
import service.CarService;
import service.CrudImpl;
import service.impl.CarServiceImpl;
import view.View;

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
                View view = new View(carController);

                view.start();

            }
    }
