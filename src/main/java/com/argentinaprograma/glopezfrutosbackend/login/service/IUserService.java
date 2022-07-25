package com.argentinaprograma.glopezfrutosbackend.login.service;

import com.argentinaprograma.glopezfrutosbackend.login.entity.Role;
import com.argentinaprograma.glopezfrutosbackend.login.entity.User;

import java.util.List;

public interface IUserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleRoUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();
}
