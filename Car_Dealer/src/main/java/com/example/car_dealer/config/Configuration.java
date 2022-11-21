package com.example.car_dealer.config;

import com.google.gson.Gson;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
  @Bean
  public  Gson getGson() { return new Gson(); }

  @Bean
  public ModelMapper modelMapper() { return new ModelMapper(); }
}
