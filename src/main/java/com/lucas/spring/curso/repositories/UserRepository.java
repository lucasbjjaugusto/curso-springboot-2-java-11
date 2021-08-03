package com.lucas.spring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.spring.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}