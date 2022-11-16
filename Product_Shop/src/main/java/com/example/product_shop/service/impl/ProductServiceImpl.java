package com.example.product_shop.service.impl;

import com.example.product_shop.model.entity.Product;
import com.example.product_shop.repository.ProductRepository;
import com.example.product_shop.service.ProductService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
  private final ProductRepository productRepository;

  @Override public void save(Product product) {
    productRepository.save(product);
  }

  @Override public long count() {
    return productRepository.count();
  }
}
