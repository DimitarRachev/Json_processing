package com.example.product_shop.service;

import com.example.product_shop.model.entity.Product;

public interface ProductService {
  void save(Product product);

  long count();

}
