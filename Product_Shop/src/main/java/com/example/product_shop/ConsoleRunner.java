package com.example.product_shop;

import com.example.product_shop.service.CategoryService;
import com.example.product_shop.service.ProductService;
import com.example.product_shop.service.SeedService;
import com.example.product_shop.service.UserService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ConsoleRunner implements CommandLineRunner {
  private final SeedService seedService;
  private final UserService userService;
  private final ProductService productService;
  private final CategoryService categoryService;

  @Override public void run(String... args) throws Exception {
    seedService.seedAll();
  }
}
