package service.impl;

import entity.Car;
import repository.CarRepository;
import service.CarService;

import java.util.List;

public class CarServiceImpl implements CarService
    {
        private CarRepository carRepository;

        public CarServiceImpl(CarRepository carRepository)
            {
                this.carRepository = carRepository;
            }

        @Override
        public List<Car> findAll()
            {
                List<Car> all = carRepository.findAll();
                if(all.isEmpty()) throw new RuntimeException("Машин нет");
                return  all;
            }

        @Override
        public Car findById(int id)
            {
                Car byId = carRepository.findById(id);
                if(byId == null) throw new RuntimeException("Машины нет");
                return byId;
            }

        @Override
        public Car save(Car car)
            {

                return carRepository.save(car);
            }

        @Override
        public void update(int id, Car car)
            {
                Car byId = carRepository.findById(id);
                if(byId == null) throw new RuntimeException("Машины нет");
                carRepository.update(id, car);
            }

        @Override
        public void deleteById(int id)
            {
                Car byId = carRepository.findById(id);
                if(byId == null) throw new RuntimeException("Машины нет");
                carRepository.deleteById(id);
            }
    }
