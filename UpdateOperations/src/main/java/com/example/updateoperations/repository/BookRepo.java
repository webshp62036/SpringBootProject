package com.example.updateoperations.repository;

import com.example.updateoperations.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface BookRepo extends JpaRepository<BookEntity,Integer> {
}
