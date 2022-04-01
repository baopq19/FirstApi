package com.baopq.firstapi.service.user;

import com.baopq.firstapi.domain.role.Role;
import com.baopq.firstapi.domain.role.RoleJpaRepository;
import com.baopq.firstapi.domain.user.User;
import com.baopq.firstapi.domain.user.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImpl implements UserService {
    private final UserJpaRepository userJpaRepository;
    private final RoleJpaRepository roleJpaRepository;

    @Override
    public User saveUser(User user) {
        return userJpaRepository.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        return roleJpaRepository.save(role);
    }

    @Override
    public void addRole(String username, String roleName) {
        User user = userJpaRepository.findByUsername(username);
        Role role = roleJpaRepository.findByName(roleName);
        user.getRoles().add(role);
        userJpaRepository.save(user);
    }

    @Override
    public User getUser(String username) {
        return userJpaRepository.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        return userJpaRepository.findAll();
    }
}
