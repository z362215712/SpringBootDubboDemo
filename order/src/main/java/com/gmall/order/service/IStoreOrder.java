package com.gmall.order.service;

import com.gmall.order.entity.Order;

public interface IStoreOrder {
    Order getOrder(String id);
}
