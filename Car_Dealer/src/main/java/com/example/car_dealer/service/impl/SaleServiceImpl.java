package com.example.car_dealer.service.impl;

import com.example.car_dealer.repository.SaleRepository;
import com.example.car_dealer.service.SaleService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SaleServiceImpl implements SaleService {
  private final SaleRepository saleRepository;
}
