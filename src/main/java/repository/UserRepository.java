package repository;

import entity.Order;
import entity.User;

import java.util.List;

public interface UserRepository
    {
        List<User> findAllToList();

        Order findById(int id);

        Order save(User user);

        void update(int id, User user);

        void deleteById(int id);
    }
