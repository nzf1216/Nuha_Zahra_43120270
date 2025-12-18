package com.restaurant.service;

import java.util.List;
import com.restaurant.entity.Order;

public interface OrderService {

    Order placeOrder(Order order);

    List<Order> getAllOrders();

    Order updateStatus(Long id, String status); // ✅ REQUIRED
}
