package com.example.car_dealer;

import com.example.car_dealer.service.CarService;
import com.example.car_dealer.service.CustomerService;
import com.example.car_dealer.service.SeedService;
import com.google.gson.Gson;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class CommandRunner implements CommandLineRunner {
  private final SeedService seedService;
  private final CustomerService customerService;
  private final CarService carService;
  private final Gson gson;

  @Override public void run(String... args) throws Exception {
    seedService.seedAll();
    orderedCustomers();
  }

  private void orderedCustomers() {
    customerService
      .findAllOrderedByBirthDateAndYoung()
      .stream()
      .map(gson::toJson)
      .forEach(System.out::println);
  }
}
