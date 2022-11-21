package com.example.car_dealer.service.impl;

import java.util.Random;

import com.example.car_dealer.model.entity.Car;
import com.example.car_dealer.repository.CarRepository;
import com.example.car_dealer.service.CarService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
  private final CarRepository carRepository;
  private final Random random;

  @Override public long count() {
    return carRepository.count();
  }

  @Override public void save(Car car) {
    carRepository.save(car);
  }

  @Override public Car getRandomCar() {
    long id = random.nextLong(carRepository.count()) + 1L;
    return carRepository.findById(id).orElseThrow(RuntimeException::new);
  }
}
