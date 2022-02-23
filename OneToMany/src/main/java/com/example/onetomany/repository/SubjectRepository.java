package com.example.onetomany.repository;

import com.example.onetomany.entity.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SubjectRepository extends JpaRepository<SubjectEntity,Integer> {

}
