package com.projetoa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
