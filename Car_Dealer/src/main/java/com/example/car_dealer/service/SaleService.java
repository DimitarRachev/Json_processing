package com.example.car_dealer.service;

import com.example.car_dealer.model.entity.Car;
import com.example.car_dealer.model.entity.Customer;
import com.example.car_dealer.model.entity.Sale;

public interface SaleService {

  void save(Car car, Customer customer, Double discount);
}
