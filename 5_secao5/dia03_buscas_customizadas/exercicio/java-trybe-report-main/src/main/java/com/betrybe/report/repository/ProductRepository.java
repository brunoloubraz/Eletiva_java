package com.betrybe.report.repository;

import com.betrybe.report.entity.Product;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {

  List<Product> findByExpirationDateBefore(LocalDate today);

  List<Product> findByExpirationDateAfter(LocalDate today);

  List<Product> findByCreationDate(LocalDate date);

  List<Product> findByExpirationDateBetween(LocalDate start, LocalDate end);
}
