package com.example.signup_login_assignment.service;

import com.example.signup_login_assignment.dto.UserDto;
import com.example.signup_login_assignment.entity.User;
import com.example.signup_login_assignment.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class UserService {
    String message = null;
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public String userRegistration(UserDto userDto) {
        String phone = null, email = null;
        if(true) {
            if (!emailValidation(userDto.getEmail())) {
                email = "Error";
            }
            if (!phoneValidation(userDto.getPhoneNo())) {
                phone = "Error";
            }
            if (phone != null || email != null) {
                if (phone != null) {
                    message = "please enter valid mobile no !!";
                }
                if (email != null) {
                    message = "please enter valid email address !!";
                }
            } else {
                User obj = new User();
                obj.setUserName(userDto.getUserName());
                obj.setEmail(userDto.getEmail());
                obj.setPhoneNo(userDto.getPhoneNo());
                obj.setAge(userDto.getAge());
                obj.setGender(userDto.getGender());
                obj.setUserPassword(passwordConverter(userDto.getUserPassword()));
                userRepository.save(obj);
                message = "Data Successfully Saved !!!!";
            }

        } else {
            message = "Please Fill Proper Data !!!!!";
        }
        return message;
    }
    //Login Method
    public String login(String email, String password) {
        message = null;
        String passwordString = passwordConverter(password);
        User user =userRepository.findUser(email,passwordString);
         try{
              if(user!=null) {
                  message="Successfully Login !!!!";
              }
              else {
                  message="Sorry you have enter wrong email or password";
              }

         }catch (NullPointerException e){
             message="Exception Or No Records Found";
         }

        return message;
    }
    // method for email validation
    public boolean emailValidation(String email) {
        String regexPattern ="^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regexPattern);
        return pattern.matcher(email).matches();
    }
    //Method for mobile no varification
    public boolean phoneValidation(String phone_no) {
        Pattern ptrn = Pattern.compile("(0/91)?[6-9][0-9]{9}");
        return ptrn.matcher(phone_no).matches();
    }
    // Method for converting password into hashCode
    public String passwordConverter(String password) {
        BCryptPasswordEncoder b = new BCryptPasswordEncoder();
        return b.encode(password);
    }
}


