package com.argentinaprograma.glopezfrutosbackend.repository;

import com.argentinaprograma.glopezfrutosbackend.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
