package com.gmall.order.entity;

import java.io.Serializable;

public class Order implements Serializable {
    private String orderid;
    private String orderName;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
