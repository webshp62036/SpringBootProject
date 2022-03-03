package com.example.signup_login_assignment.dto;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Data
public class UserDto{
       private String email;
       private String userPassword;
       private String phoneNo;
       private String userName;
       private int age;
       private String gender;
}
