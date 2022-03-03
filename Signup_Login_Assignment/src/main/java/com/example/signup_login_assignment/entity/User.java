package com.example.signup_login_assignment.entity;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull
    private int id;
    @Column(name = "user_name")
    @NotNull
    private String userName;
    @Column(name = "email")
    @NotNull
    private String email;
    @NotNull
    @Column(name = "user_password")
    private String userPassword;
    @Column(name = "phone_no")
    @NotNull
    private String phoneNo;
    @Column(name = "age")
    @NotNull
    private int age;
    @Column(name = "gender")
    @NotNull
    private String gender;

}
