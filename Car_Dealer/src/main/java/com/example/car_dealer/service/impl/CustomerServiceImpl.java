package com.example.car_dealer.service.impl;

import com.example.car_dealer.repository.CustomerRepository;
import com.example.car_dealer.service.CustomerService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
  private final CustomerRepository customerRepository;
}
