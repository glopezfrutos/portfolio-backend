package com.argentinaprograma.glopezfrutosbackend.repository;

import com.argentinaprograma.glopezfrutosbackend.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
