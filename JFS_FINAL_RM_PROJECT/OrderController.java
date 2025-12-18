package com.restaurant.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.restaurant.entity.Order;
import com.restaurant.service.OrderService;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    // Place new order
    @PostMapping
    public Order placeOrder(@RequestBody Order order) {
        return service.placeOrder(order);
    }

    // Get all orders
    @GetMapping
    public List<Order> getAllOrders() {
        return service.getAllOrders();
    }

    // Update order status
    @PutMapping("/{id}/status/{status}")
    public Order updateStatus(
            @PathVariable Long id,
            @PathVariable String status) {
        return service.updateStatus(id, status);
    }
}
