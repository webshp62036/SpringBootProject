package com.example.crudeoperation.repository;

import com.example.crudeoperation.entity.DeptEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface DeptRepository extends JpaRepository<DeptEntity,Integer> {
}
