package com.baopq.firstapi.service.user;

import com.baopq.firstapi.domain.role.Role;
import com.baopq.firstapi.domain.user.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRole(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
