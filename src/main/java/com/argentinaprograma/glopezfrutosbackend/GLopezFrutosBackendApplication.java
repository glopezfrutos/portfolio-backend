package com.argentinaprograma.glopezfrutosbackend;

import com.argentinaprograma.glopezfrutosbackend.login.entity.Role;
import com.argentinaprograma.glopezfrutosbackend.login.entity.User;
import com.argentinaprograma.glopezfrutosbackend.login.repository.RoleRepository;
import com.argentinaprograma.glopezfrutosbackend.login.repository.UserRepository;
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
    CommandLineRunner run(UserService service, UserRepository userRepository, RoleRepository roleRepository) {
        return args -> {
            Role role_admin = roleRepository.findByName("ROLE_ADMIN");
            if (role_admin == null) {
                service.saveRole(new Role(null, "ROLE_ADMIN"));
            }
            Role role_user = roleRepository.findByName("ROLE_USER");
            if (role_user == null) {
                service.saveRole(new Role(null, "ROLE_USER"));
            }
            User admin = userRepository.findByUsername("admin");
            if (admin == null) {
                service.saveUser(new User(null, "Admin", "admin", "1234", new ArrayList<>()));
                service.addRoleRoUser("Admin", "ROLE_ADMIN");
            }
            User user = userRepository.findByUsername("user");
            if (user == null) {
                service.saveUser(new User(null, "User", "user", "1234", new ArrayList<>()));
                service.addRoleRoUser("User", "ROLE_USER");
            }
        };
    }
}
