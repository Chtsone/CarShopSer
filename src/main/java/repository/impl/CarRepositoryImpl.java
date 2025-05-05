package repository.impl;

import db.CarDataBase;
import entity.Car;
import mapper.CarMapper;
import repository.CarRepository;
import sequence.Sequence;

import java.util.List;

public class CarRepositoryImpl implements CarRepository
    {
        private CarDataBase cars;
        private Sequence sequence;
        private CarMapper carMapper;

        public CarRepositoryImpl(CarDataBase cars, Sequence sequence, CarMapper carMapper)
            {
                this.cars = cars;
                this.sequence = sequence;
                this.carMapper = carMapper;
            }

        @Override
        public List<Car> findAll()
            {
                return cars.getCars().values().stream().toList();
            }

        @Override
        public Car findById(int id)
            {
                return cars.getCars().get(id);
            }

        @Override
        public Car save(Car car)
            {
                int next = sequence.next();
                carMapper.fillId(car,next);                     //вернул работоспособность добавления, придется для апдейта добавить свое
                cars.getCars().put(car.getId(), car);
                return car;
            }

        @Override
        public void update(int id, Car car)
            {
                cars.getCars().put(id, car);
            }



        @Override
        public void deleteById(int id)
            {
                cars.getCars().remove(id);
            }
    }
