package com.example.car_dealer.constant;

public enum Path {
  ;
  private final String BASE_PATH = "Car_Dealer/src/main/resources/files";
  public final Path CARS_JSON =  Path.valueOf(BASE_PATH + "/cars.json");
  public final Path CUSTOMER_JSON =  Path.valueOf(BASE_PATH + "/customer.json");
  public final Path PARTS_JSON =  Path.valueOf(BASE_PATH + "/parts.json");
  public final Path SUPPLIER_JSON =  Path.valueOf(BASE_PATH + "/suppliers.json");

}
