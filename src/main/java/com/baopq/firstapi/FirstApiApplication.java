package com.baopq.firstapi;

import com.baopq.firstapi.domain.role.Role;
import com.baopq.firstapi.domain.user.User;
import com.baopq.firstapi.service.role.RoleService;
import com.baopq.firstapi.service.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class FirstApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstApiApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService, RoleService roleService) {
        return args -> {
            roleService.saveRole(new Role(null, "ADMIN"));
            roleService.saveRole(new Role(null, "MANAGER"));

            userService.saveUser(new User(null, "baopq19", "baopq19", "bO.191910", new ArrayList<Role>()));

            userService.addRole("baopq19", "ADMIN");
        };
    }

}
