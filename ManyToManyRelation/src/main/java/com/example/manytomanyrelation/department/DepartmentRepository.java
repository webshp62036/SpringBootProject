package com.example.manytomanyrelation.department;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories

public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Integer> {
}
