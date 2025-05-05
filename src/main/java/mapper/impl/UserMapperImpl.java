package mapper.impl;

import entity.User;
import mapper.UserMapper;

public class UserMapperImpl implements UserMapper
    {
        @Override
        public User fillId(User user, int id)
            {
                user.setId(id);
                return user;
            }
    }
