package com.komshuu.komshuu.model;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ecyamak
 */

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;
    private String orderType;
    private Date orderDate;
    private long flatId;

    public Order() {

    }

    public Order(long orderId, String orderType, Date orderDate, long flatId) {
        this.orderId = orderId;
        this.orderType = orderType;
        this.orderDate = orderDate;
        this.flatId = flatId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public long getFlatId() {
        return flatId;
    }

    public void setFlatId(long flatId) {
        this.flatId = flatId;
    }
}
