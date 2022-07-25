package com.argentinaprograma.glopezfrutosbackend.login.repository;

import com.argentinaprograma.glopezfrutosbackend.login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
