package com.example.signup_login_assignment.repository;
import com.example.signup_login_assignment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    
}
