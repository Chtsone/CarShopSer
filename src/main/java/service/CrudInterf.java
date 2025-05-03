package service;

import entity.Car;

import java.util.HashMap;
import java.util.Scanner;

public interface CrudInterf
    {
        void create(Scanner scanner, HashMap<Integer, Car> carList);
        void read(HashMap<Integer, Car> carList);

        void update(Scanner scanner, HashMap<Integer, Car> carList);

        void delete(Scanner scanner, HashMap<Integer, Car> carList);
    }
