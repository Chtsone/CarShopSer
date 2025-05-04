package db;

import entity.Car;

import java.util.HashMap;
import java.util.Map;

public interface CarDataBase
    {
        Map<Integer, Car> getCars();
    }
