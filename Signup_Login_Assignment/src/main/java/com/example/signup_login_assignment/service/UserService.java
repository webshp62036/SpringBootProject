package com.example.signup_login_assignment.service;
import com.example.signup_login_assignment.dto.UserDto;
import com.example.signup_login_assignment.entity.User;
import com.example.signup_login_assignment.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
        if (userDto.getUser_name() != null && userDto.getEmail() != null && userDto.getPhone_no() != null && userDto.getAge() > 0
                && userDto.getGender() != null && userDto.getUser_password() != null) {
            if (!emailValidation(userDto.getEmail())) {
                email = "Error";
            }
            if (!phoneValidation(userDto.getPhone_no())) {
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
                obj.setUser_name(userDto.getUser_name());
                obj.setEmail(userDto.getEmail());
                obj.setPhone_no(userDto.getPhone_no());
                obj.setAge(userDto.getAge());
                obj.setGender(userDto.getGender());
                obj.setUser_password(passwordConverter(userDto.getUser_password()));
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
        /* this statement basically convert incoming(during login) password into hash password and then pass to 'findUser' method

        -- 'password' Is Original Password
        -- first of all i get this original password & convert into hash password using MD5 algorithm that is " passwordString";
        -- Then i did pass it into findUser(email,passwordString ) method for Query operation
        */
        String passwordString = passwordConverter(password);
         User user =userRepository.findUser(email,passwordString);
         if(user.getEmail().equals(email) && user.getUser_password().equals(passwordString) ){
            message="Successfully Login !!!!";
        }
        else
        {
            message="You have entered wrong email or password !!";
        }
        return message;
    }

    // method for email validation
    public boolean emailValidation(String email) {
        String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
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
        StringBuilder stringBuilder = new StringBuilder();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(password.getBytes());
            byte[] bytes = messageDigest.digest();
            for (int i = 0; i < bytes.length; i++) {
                stringBuilder.append(bytes[i]);
            }
        }catch (NoSuchAlgorithmException e) {
               e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}


