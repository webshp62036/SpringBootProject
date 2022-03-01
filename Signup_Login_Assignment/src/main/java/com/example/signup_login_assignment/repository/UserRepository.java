package com.example.signup_login_assignment.repository;
import com.example.signup_login_assignment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query("SELECT u FROM User u WHERE u.email=:email AND u.user_password=:password" )
    public User findUser(@Param("email") String email, @Param("password") String user_password);


}