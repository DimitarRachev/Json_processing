package com.example.car_dealer.service.impl;

import com.example.car_dealer.repository.CarRepository;
import com.example.car_dealer.service.CarService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
  private final CarRepository carRepository;
}
