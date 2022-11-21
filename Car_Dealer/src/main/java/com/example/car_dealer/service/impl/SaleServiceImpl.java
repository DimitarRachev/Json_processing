package com.example.car_dealer.service.impl;

import javax.transaction.Transactional;

import com.example.car_dealer.model.entity.Car;
import com.example.car_dealer.model.entity.Customer;
import com.example.car_dealer.model.entity.Sale;
import com.example.car_dealer.repository.SaleRepository;
import com.example.car_dealer.service.CustomerService;
import com.example.car_dealer.service.SaleService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SaleServiceImpl implements SaleService {
  private final SaleRepository saleRepository;
  private final CustomerService customerService;


  @Override public void save(Car car, Customer customer, Double discount) {
    Sale sale = new Sale(car, customer, discount);
    customer.getSales().add(sale);
 customerService.save(customer);
 saleRepository.save(sale);
  }
}
