package com.argentinaprograma.glopezfrutosbackend.login.service;

import com.argentinaprograma.glopezfrutosbackend.login.model.User;
import com.argentinaprograma.glopezfrutosbackend.login.model.Role;

import java.util.List;

public interface IUserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleRoUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
