package com.example.project01.User.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project01.User.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {}
