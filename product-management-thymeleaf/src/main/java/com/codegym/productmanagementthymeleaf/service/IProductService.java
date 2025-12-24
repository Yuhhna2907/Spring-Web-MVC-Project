package com.codegym.productmanagementthymeleaf.service;

import com.codegym.productmanagementthymeleaf.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(int id);
    void save(Product product);
    void update(int id, Product product);
    void remove(int id);
    List<Product> searchByName(String name);
}
