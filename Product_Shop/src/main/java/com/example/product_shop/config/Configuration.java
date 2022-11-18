package com.example.product_shop.config;

import java.io.FileReader;
import java.util.Random;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {

  @Bean
  public Gson getGson() {
    return new GsonBuilder().setPrettyPrinting().create();
  }

  @Bean
  public ModelMapper getModelMapper() {
    return new ModelMapper();
  }

  @Bean
  public Random getRandom() { return new Random(); }
}
