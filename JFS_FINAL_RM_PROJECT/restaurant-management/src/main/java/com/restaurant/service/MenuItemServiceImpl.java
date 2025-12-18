package com.restaurant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurant.entity.MenuItem;
import com.restaurant.repository.MenuItemRepository;

@Service
public class MenuItemServiceImpl implements MenuItemService {

    private final MenuItemRepository repo;

    public MenuItemServiceImpl(MenuItemRepository repo) {
        this.repo = repo;
    }

    @Override
    public MenuItem save(MenuItem item) {
        return repo.save(item);
    }

    @Override
    public List<MenuItem> getAll() {
        return repo.findAll();
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
