package db.impl;

import db.UserDataBase;
import entity.Car;
import entity.User;

import java.util.Map;

public class UserDataBaseImpl implements UserDataBase
    {
        private Map<Integer, User> users; // TODO именно здесь создать Cars в конструкторе

        @Override
        public Map<Integer, User> getUsers()
            {
                return users;
            }
    }
