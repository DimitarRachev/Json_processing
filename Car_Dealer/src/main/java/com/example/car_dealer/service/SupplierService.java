package com.example.car_dealer.service;

import com.example.car_dealer.model.entity.Supplier;

public interface SupplierService {
   void save(Supplier supplier);

  long count();
  Supplier getRandomSupplier();
}
