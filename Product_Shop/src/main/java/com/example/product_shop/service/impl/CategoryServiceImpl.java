package com.example.product_shop.service.impl;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import com.example.product_shop.model.entity.Category;
import com.example.product_shop.repository.CategoryRepository;
import com.example.product_shop.service.CategoryService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
  private final CategoryRepository categoryRepository;
  private final Random random;

  @Override public void save(Category category) {
    categoryRepository.save(category);
  }

  @Override public Set<Category> getRandomCategories() {
    int numCategories = random.nextInt(3) + 1;
    Set<Category> categories = new HashSet<>();
    long bound = categoryRepository.count() ;
    for (int i = 0; i < numCategories; i++) {
      Long index = random.nextLong(bound ) + 1;
      categories.add(categoryRepository.findById(index).orElseThrow(RuntimeException::new));
    }
    return categories;
  }

  @Override public long count() {
    return categoryRepository.count();
  }
}
