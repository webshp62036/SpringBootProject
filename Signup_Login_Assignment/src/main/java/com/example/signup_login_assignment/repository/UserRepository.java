package com.example.signup_login_assignment.repository;
import com.example.signup_login_assignment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query("SELECT u FROM User u WHERE u.email=:email")
    public User existEmail(@Param("email") String email);
    @Query("SELECT u FROM User u WHERE u.email=:email " )
    public User findUser(@Param("email") String email);


}
