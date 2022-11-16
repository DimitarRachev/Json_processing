package com.example.product_shop.service.impl;

import java.util.Random;

import com.example.product_shop.model.entity.User;
import com.example.product_shop.repository.UserRepository;
import com.example.product_shop.service.UserService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
  private final UserRepository userRepository;
private final Random random;
  @Override public void save(User user) {
    userRepository.save(user);
  }

  @Override public User getRandomUser() {
   Long index = random.nextLong(userRepository.count() ) + 1;
    return userRepository.findById(index).orElseThrow(RuntimeException::new);
  }

  @Override public long count() {
    return userRepository.count();
  }
}
