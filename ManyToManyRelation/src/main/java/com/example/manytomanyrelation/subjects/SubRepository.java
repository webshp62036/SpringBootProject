package com.example.manytomanyrelation.subjects;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface SubRepository extends JpaRepository<SubEntity,Integer> {
}
