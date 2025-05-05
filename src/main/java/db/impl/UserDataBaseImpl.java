package db.impl;

import constant.UserRole;
import db.UserDataBase;
import entity.Car;
import entity.User;
import mapper.UserMapper;
import mapper.impl.UserMapperImpl;
import sequence.Sequence;
import sequence.impl.UserSequence;

import java.util.HashMap;
import java.util.Map;

public class UserDataBaseImpl implements UserDataBase
    {
        private Map<Integer, User> users;
        private UserMapper userMapper;
        private Sequence sequence;
        public UserDataBaseImpl()
            {
                users = new HashMap<Integer, User>();
                this.userMapper = new UserMapperImpl();
                this.sequence = new UserSequence();
                for(int i = 0; i < 100;i++)
                    {
                        User user = new User("User %d".formatted(i),"Password %d".formatted(i), UserRole.CLIENT );

                    }

            }

        @Override
        public Map<Integer, User> getUsers()
            {
                return users;
            }
    }
