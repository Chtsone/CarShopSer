package repository;

import db.CarDataBase;
import entity.Car;

import java.util.List;

public interface CarRepository
    {
        List<Car> findAll();

        Car findById(int id);

        Car save(Car car);

        void deleteById(int id);
    }
