package com.projetoa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
