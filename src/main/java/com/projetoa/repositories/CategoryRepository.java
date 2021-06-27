package com.projetoa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
