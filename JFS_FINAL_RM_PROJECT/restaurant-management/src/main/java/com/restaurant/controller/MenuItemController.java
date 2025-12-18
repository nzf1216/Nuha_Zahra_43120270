package com.restaurant.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.restaurant.entity.MenuItem;
import com.restaurant.service.MenuItemService;

@RestController
@RequestMapping("/api/menu")
@CrossOrigin("*")
public class MenuItemController {

    private final MenuItemService service;

    public MenuItemController(MenuItemService service) {
        this.service = service;
    }

    // Add menu item
    @PostMapping
    public MenuItem addItem(@RequestBody MenuItem item) {
        return service.save(item);
    }

    // Get all menu items
    @GetMapping
    public List<MenuItem> getItems() {
        return service.getAll();
    }

    // Delete menu item
    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        service.delete(id);
    }
}
