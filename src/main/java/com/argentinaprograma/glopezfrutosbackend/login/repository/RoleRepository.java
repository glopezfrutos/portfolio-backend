package com.argentinaprograma.glopezfrutosbackend.login.repository;

import com.argentinaprograma.glopezfrutosbackend.login.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}