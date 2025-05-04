package db;

import entity.Car;
import entity.User;

import java.util.Map;

public interface UserDataBase
    {
        Map<Integer, User> getUsers();

    }
