package internal.enlightsec.secdev.controller;

import internal.enlightsec.secdev.domain.User;
import internal.enlightsec.secdev.domain.Role;
import internal.enlightsec.secdev.enums.RBACCommandResults;
import internal.enlightsec.secdev.service.RBACService;
import internal.enlightsec.secdev.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

// This is supposed to 
@RequestMapping("/api")
@RestController @RequiredArgsConstructor
public class RBACResource {
    private RBACService rbacService;

    @GetMapping("/test")
    public String getUsers() {
        if (rbacService.HasPermission(1) == RBACCommandResults.RBAC_OK)
        {
            return "OK";
        }
        else
        {
            return "Not OK";
        }

    }
/* 
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
    */
}

