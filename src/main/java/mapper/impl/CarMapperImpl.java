package mapper.impl;

import entity.Car;
import mapper.CarMapper;

public class CarMapperImpl implements CarMapper
    {
        @Override
        public Car fillId(Car car, int id)
            {
                car.setId(id);
                return car;
            }
    }
