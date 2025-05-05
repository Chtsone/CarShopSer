package mapper.impl;

import entity.Order;
import mapper.OrderMapper;

public class OrderMapperImpl implements OrderMapper
    {
        @Override
        public Order fillId(Order order, int id)
            {
                order.setId(id);
                return order;
            }
    }
