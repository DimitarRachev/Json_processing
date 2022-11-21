package com.example.car_dealer.service.impl;

import com.example.car_dealer.service.CarService;
import com.example.car_dealer.service.CustomerService;
import com.example.car_dealer.service.PartService;
import com.example.car_dealer.service.SaleService;
import com.example.car_dealer.service.SeedService;
import com.example.car_dealer.service.SupplierService;
import com.google.gson.Gson;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SeedServiceImpl implements SeedService {
  private final ModelMapper mapper;
  private final Gson gson;
  private final CustomerService customerService;
  private final SupplierService supplierService;
  private final PartService partService;
  private final CarService carService;
  private final SaleService saleService;

  @Override public void seedSales() {

  }

  @Override public void seedCars() {

  }

  @Override public void seedParts() {

  }

  @Override public void seedSuppliers() {

  }

  @Override public void seedCustomers() {

  }
}
