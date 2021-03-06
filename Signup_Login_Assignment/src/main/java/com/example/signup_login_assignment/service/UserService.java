package com.example.signup_login_assignment.service;

import com.example.signup_login_assignment.dto.UserDto;
import com.example.signup_login_assignment.entity.User;
import com.example.signup_login_assignment.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;


@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    String message = null;
    BCryptPasswordEncoder b = new BCryptPasswordEncoder();

    public String userRegistration(UserDto userDto) {
        String phone = null, email = null;
        if(userDto !=null) {
            //
            if (userRepository.existEmail(userDto.getEmail()) == null) {

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
        }else
            {
                message=userDto.getEmail()+ " alredy exist!! please try with other email";
            }

        }
        else {
            message = "Please Fill Proper Data !!!!!";
        }
        return message;
    }
    //Login Method
    public String login(String email, String password) {
        message = null;
        try{
             User user =userRepository.findUser(email);
              if(userVerification(user,password,email)) {
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
    // method for email expression validation
    public boolean emailValidation(String email) {
        String regexPattern ="^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regexPattern);
        return pattern.matcher(email).matches();
    }
    //Method for mobile no pattern varification
    public boolean phoneValidation(String phone_no) {
        Pattern ptrn = Pattern.compile("(0/91)?[6-9][0-9]{9}");
        return ptrn.matcher(phone_no).matches();
    }
    // Method for encrypt password
    public String passwordConverter(String password) {
        return b.encode(password);
    }
    // For validating given password with existing password
    public boolean userVerification(User user1,String password1,String email1){
         boolean result=false;
        if(email1.equals(user1.getEmail()) && (b.matches(password1,user1.getUserPassword())){
            result = true;
        }
        return result;
    }
    }
}


