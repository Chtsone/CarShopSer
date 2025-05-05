package service;

import entity.Car;

import java.util.List;

public interface CarService
    {
        List<Car> findAll();

        Car findById(int id);

        Car save(Car car);

        void update(int id, Car car);

        void deleteById(int id);
    }
