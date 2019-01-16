package com.komshuu.komshuu.model;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ecyamak
 */

@Entity
@Table(name = "orders")
public class Order {
    private long orderId;
    private String orderType;
    private String orderDate;
    private long flatId;
    private long apartmentId;

    public Order() {

    }

    public Order(long orderId, String orderType, String orderDate, long flatId, long apartmentId) {
        this.orderId = orderId;
        this.orderType = orderType;
        this.orderDate = orderDate;
        this.flatId = flatId;
        this.setApartmentId(apartmentId);
    }

    @Id
    @Column(name = "orderId", columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public long getFlatId() {
        return flatId;
    }

    public void setFlatId(long flatId) {
        this.flatId = flatId;
    }

    public long getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(long apartmentId) {
        this.apartmentId = apartmentId;
    }
}
