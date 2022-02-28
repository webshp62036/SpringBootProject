package com.example.signup_login_assignment.service;

import com.example.signup_login_assignment.dto.UserDto;
import com.example.signup_login_assignment.entity.User;
import com.example.signup_login_assignment.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public String userRegistration(UserDto userDto) {
        String message = null;
        String phone=null,email=null;

        if(userDto.getUser_name() !=null && userDto.getEmail() !=null && userDto.getPhone_no() !=null && userDto.getAge()>0
                && userDto.getGender() !=null && userDto.getUser_password() !=null ){

            if(!emailValidation(userDto.getEmail())){
                email = "Enter Email Id Like EX : subash@gmail.com";
            }
            if(!phoneValidation(userDto.getPhone_no())){
                 phone ="Please Enter Valid Mobile No !!!";
            }
            if(phone !=null || email !=null){
              message= phone +" or "+email;
            }
            else
            {
                User obj = new User();
                obj.setUser_name(userDto.getUser_name());
                obj.setEmail(userDto.getEmail());
                obj.setPhone_no(userDto.getPhone_no());
                obj.setAge(userDto.getAge());
                obj.setGender(userDto.getGender());
                obj.setUser_password(userDto.getUser_password());
                userRepository.save(obj);
                message="Data Successfully Saved !!!!";
            }

        }
        else
        {
            message="Please Fill Proper Data !!!!!";
        }
      return message;
    }// method for email validation
    public boolean emailValidation(String email){
          String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
               Pattern pattern =Pattern.compile(regexPattern);
               return pattern.matcher(email).matches();
    }
    //Method for mobile no varification
    public boolean phoneValidation(String phone_no){
        Pattern ptrn = Pattern.compile("(0/91)?[6-9][0-9]{9}");
        return ptrn.matcher(phone_no).matches();
    }

}



