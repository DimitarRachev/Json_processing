package com.example.product_shop.repository;

import java.util.List;

import javax.transaction.Transactional;

import com.example.product_shop.model.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


  @Query("SELECT u FROM User u WHERE u.productsSold.size > 0")
  List<User> findAllSuccessfullySellers();
}
