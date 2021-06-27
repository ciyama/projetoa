package com.projetoa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
