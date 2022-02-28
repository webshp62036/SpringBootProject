package com.example.signup_login_assignment.dto;
import javax.persistence.*;

@Table(name = "user")
public class UserDto{

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private int id;
        @Column(name = "user_name")
        private String user_name;
        @Column(name = "email")
        private String email;
        @Column(name = "user_password")
        private String user_password;
        @Column(name = "phone_no")
        private String phone_no;
        @Column(name = "age")
        private int age;
        @Column(name = "gender")
        private String gender;
        public void User(int id, String user_name, String email, String user_password, String phone_no, int age, String gender) {
            this.id = id;
            this.user_name = user_name;
            this.email = email;
            this.user_password = user_password;
            this.phone_no = phone_no;
            this.age = age;
            this.gender = gender;
        }
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getUser_password() {
            return user_password;
        }

        public void setUser_password(String user_password) {
            this.user_password = user_password;
        }

        public String getPhone_no() {
            return phone_no;
        }

        public void setPhone_no(String phone_no) {
            this.phone_no = phone_no;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
}
