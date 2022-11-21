package com.example.car_dealer.service.impl;

import com.example.car_dealer.repository.SupplierRepository;
import com.example.car_dealer.service.SupplierService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SupplierServiceImpl implements SupplierService {
  private final SupplierRepository repository;
}
