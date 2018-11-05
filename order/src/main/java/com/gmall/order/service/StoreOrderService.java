package com.gmall.order.service;

import com.gmall.order.entity.Order;
import org.springframework.stereotype.Service;

@Service
public class StoreOrderService implements IStoreOrder {

    @Override
    public Order getOrder(String id){
        Order order = new Order();
        order.setOrderid("10023409");
        order.setOrderName("测试订单");
        return order;
    }
}
