package internal.enlightsec.secdev.controller;

import internal.enlightsec.secdev.domain.User;
import internal.enlightsec.secdev.domain.Role;
import internal.enlightsec.secdev.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import antlr.collections.List;

@RequestMapping("/api")
@RestController @RequiredArgsConstructor
public class UserResource {
    private UserService userService;

    @GetMapping("/users")
    public String getUsers() {
        return "test";
    }

    @PostMapping("/user/save")
    public ResponseEntity<User> saveUser(User user) {
        return ResponseEntity.ok(userService.saveUser(user));
    }

    @PostMapping("/role/save")
    public ResponseEntity<Role> saveRole(@RequestBody User user) {
        Role role = new Role();
        return ResponseEntity.ok(userService.saveRole(role));
        }
    }

