package com.restaurant.service;

import java.util.List;
import com.restaurant.entity.MenuItem;

public interface MenuItemService {
    MenuItem save(MenuItem item);
    List<MenuItem> getAll();
    void delete(Long id);
}
