package controller;

import entity.Car;
import service.CarService;
import service.impl.CarServiceImpl;

import java.util.List;

public class CarController
    {

        private CarService carService;

        public CarController(CarService carService)
            {
                this.carService = carService;
            }

        public List<Car> findAll()
            {
                return carService.findAll();
            }

        public Car findById(int id)
            {
                return carService.findById(id);
            }


        public Car save(Car car)
            {
                return carService.save(car);
            }

        public void deleteById(int id)
            {
                carService.deleteById(id);
            }
    }
