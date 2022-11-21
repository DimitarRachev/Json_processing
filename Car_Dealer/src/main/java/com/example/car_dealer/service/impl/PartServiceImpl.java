package com.example.car_dealer.service.impl;

import com.example.car_dealer.repository.PartRepository;
import com.example.car_dealer.service.PartService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PartServiceImpl implements PartService {
  private final PartRepository partRepository;
}
