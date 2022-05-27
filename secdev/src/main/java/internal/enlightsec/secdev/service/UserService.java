package internal.enlightsec.secdev.service;

import internal.enlightsec.secdev.domain.Role;
import internal.enlightsec.secdev.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}


