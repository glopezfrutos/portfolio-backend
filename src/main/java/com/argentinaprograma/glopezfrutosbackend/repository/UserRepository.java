package com.argentinaprograma.glopezfrutosbackend.repository;

import com.argentinaprograma.glopezfrutosbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
