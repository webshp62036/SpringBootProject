package com.example.manytomanyrelation.Students;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface StdRepository extends JpaRepository<StdEntity,Integer> {

}
