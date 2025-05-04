package db.impl;

import db.CarDataBase;
import entity.Car;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class CarDataBaseImpl implements CarDataBase
    {

        private Map<Integer, Car> cars;

        public CarDataBaseImpl()
            {
                this.cars = new HashMap<>(); // TODO именно здесь создать Cars в конструкторе
                IntStream
                        .range(0, 100)
                        .forEach(i ->
                            {
                                cars.put(i, new Car(i,"Brand %d".formatted(i), "Model %d".formatted(i), "Color %d".formatted(i), i, i));
                            });
            }

        @Override
        public Map<Integer, Car> getCars()
            {
                return cars;
            }
    }
