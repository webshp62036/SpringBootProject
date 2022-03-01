package com.example.assignment1.repository;

import com.example.assignment1.entity.PhoneNo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface PhoneNoRepository extends JpaRepository<PhoneNo,Integer> {
}
