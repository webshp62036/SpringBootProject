package com.example.onetoone.repository;

import com.example.onetoone.Entity.CollegeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface CollegeRepository extends JpaRepository<CollegeEntity,Integer> {
}
