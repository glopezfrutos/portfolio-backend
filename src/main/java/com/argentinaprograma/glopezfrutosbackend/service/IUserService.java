package com.argentinaprograma.glopezfrutosbackend.service;

import com.argentinaprograma.glopezfrutosbackend.model.User;
import com.argentinaprograma.glopezfrutosbackend.model.Role;

import java.util.List;

public interface IUserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleRoUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
