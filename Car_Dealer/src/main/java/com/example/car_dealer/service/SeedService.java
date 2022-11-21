package com.example.car_dealer.service;

import lombok.RequiredArgsConstructor;


public interface SeedService {
  default void seedAll(){
    seedSuppliers();
    seedParts();
    seedCars();
    seedSales();
    seedCustomers();
  }

   void seedSales();

   void seedCars();

   void seedParts();

   void seedSuppliers();

   void seedCustomers();
}
