package com.argentinaprograma.glopezfrutosbackend;

import com.argentinaprograma.glopezfrutosbackend.login.model.Role;
import com.argentinaprograma.glopezfrutosbackend.login.model.User;
import com.argentinaprograma.glopezfrutosbackend.login.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class GLopezFrutosBackendApplication {
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    public static void main(String[] args) {
        SpringApplication.run(GLopezFrutosBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args ->{
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));

            userService.saveUser(new User(null, "Paul", "paul", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "John", "john", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "Ringo", "ringo", "1234", new ArrayList<>()));
            userService.saveUser(new User(null, "George", "george", "1234", new ArrayList<>()));

            userService.addRoleRoUser("ringo", "ROLE_ADMIN");
            userService.addRoleRoUser("george", "ROLE_ADMIN");
        };
    }
}
