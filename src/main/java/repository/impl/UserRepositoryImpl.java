package repository.impl;

import entity.Order;
import entity.User;
import repository.UserRepository;

import java.util.List;

public class UserRepositoryImpl implements UserRepository
    {
        @Override
        public List<User> findAllToList()
            {
                return List.of();
            }

        @Override
        public Order findById(int id)
            {
                return null;
            }

        @Override
        public Order save(User user)
            {
                return null;
            }

        @Override
        public void update(int id, User user)
            {

            }

        @Override
        public void deleteById(int id)
            {

            }
    }
