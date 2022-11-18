package com.example.product_shop.repository;

import java.math.BigDecimal;
import java.util.List;

import com.example.product_shop.model.dto.ProductExportDto;
import com.example.product_shop.model.entity.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

  @Query("select P from Product P where P.price Between :lower and :upper and P.buyer is null order by P.price")
  List<Product> findAllWithPriceBetweenWithNoSeller(BigDecimal lower, BigDecimal upper);
}
