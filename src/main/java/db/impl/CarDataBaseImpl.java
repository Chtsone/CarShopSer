package db.impl;

import db.CarDataBase;
import entity.Car;
import mapper.CarMapper;
import mapper.impl.CarMapperImpl;
import sequence.Sequence;
import sequence.impl.CarSequence;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class CarDataBaseImpl implements CarDataBase
    {

        private Map<Integer, Car> cars;
        private CarMapper carMapper;
        private Sequence sequence;

        public CarDataBaseImpl()
            {
                this.cars = new HashMap<>();
                this.sequence = new CarSequence();
                this.carMapper = new CarMapperImpl();
                for (int i = 0; i < 100; i++)
                    {
                        Car car = new Car("Brand %d".formatted(i), "Model %d".formatted(i), "Color %d".formatted(i), i, i); //секвенс при прошлом заполнении не отрабатывал, пришлось заменить на статик
                        carMapper.fillId(car,sequence.next());
                        cars.put(i,car);
                    }

            }

        @Override
        public Map<Integer, Car> getCars()
            {
                return cars;
            }
    }
