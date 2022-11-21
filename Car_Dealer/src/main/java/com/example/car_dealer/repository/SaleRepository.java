package com.example.car_dealer.repository;

import com.example.car_dealer.model.entity.Car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends JpaRepository<Car, Long> {
}
