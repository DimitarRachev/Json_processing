package com.example.car_dealer.service;

import com.example.car_dealer.model.entity.Car;

public interface CarService {
  long count();

  void save(Car car);

  Car getRandomCar();

}
