package com.example.product_shop.service;

import com.example.product_shop.model.entity.User;

public interface UserService {
   void save(User user) ;

  User getRandomUser();

  long count();
}
