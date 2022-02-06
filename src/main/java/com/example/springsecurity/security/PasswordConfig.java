package com.example.springsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created by igorsimakov on 06.02.2022
 */

@Configuration
public class PasswordConfig {

    @Bean
    public  PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(10);
    }
}
