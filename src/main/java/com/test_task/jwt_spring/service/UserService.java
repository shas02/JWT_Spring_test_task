package com.test_task.jwt_spring.service;

import com.test_task.jwt_spring.domain.Role;
import com.test_task.jwt_spring.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String userName);

    List<User> getUsers();

}
