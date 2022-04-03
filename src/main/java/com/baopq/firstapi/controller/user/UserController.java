package com.baopq.firstapi.controller.user;

import com.baopq.firstapi.domain.user.User;
import com.baopq.firstapi.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    ResponseEntity<List<User>> getUsers() {
        return ResponseEntity.ok(userService.getUsers());
    }

    @GetMapping("/users/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable("username") String username) {
        return ResponseEntity.ok(userService.getUser(username));
    }

    @PostMapping("/users")
    public ResponseEntity<User> register(@RequestBody(required = true) User user) {
        System.out.println("Here");
        System.out.println(user);
        return ResponseEntity.ok(userService.saveUser(user));
    }

//    @PostMapping("/users/{username}/addrole")
//    public ResponseEntity<?> addRoleToUser(@RequestBody(required = true) String roleName) {
//        return ResponseEntity.ok(userService.saveRole(user));
//    }
}
