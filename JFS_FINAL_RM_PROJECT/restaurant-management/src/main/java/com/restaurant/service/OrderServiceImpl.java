package com.restaurant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurant.entity.Order;
import com.restaurant.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository repository;

    public OrderServiceImpl(OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public Order placeOrder(Order order) {
        order.setStatus("Placed");
        return repository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    @Override
    public Order updateStatus(Long id, String status) {
        Order order = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
        order.setStatus(status);
        return repository.save(order);
    }
}
