package com.shobhit.springboot.webapptodolist.login;


import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password){

        boolean isValidUsername = username.equalsIgnoreCase("molu");
        boolean isValidPassword = password.equals("molu");


        return isValidUsername && isValidPassword;
    }
}
