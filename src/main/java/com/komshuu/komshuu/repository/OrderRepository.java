package com.komshuu.komshuu.repository;

import com.komshuu.komshuu.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ecyamak
 */

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findAllByApartmentId(long apartmentId);

    Order findByOrderId(long orderId);

    Order getByOrderIdAndApartmentId(long id, long apartmentId);

    List<Order> findAllByApartmentIdAndAndOrderDate(long apartmentId, String orderDate);
}
