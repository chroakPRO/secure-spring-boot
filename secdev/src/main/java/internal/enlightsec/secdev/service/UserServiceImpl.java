package internal.enlightsec.secdev.service;


import internal.enlightsec.secdev.domain.Role;
import internal.enlightsec.secdev.domain.User;
import internal.enlightsec.secdev.repo.RoleRepo;
import internal.enlightsec.secdev.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {
    private  UserRepo userRepo;
    private  RoleRepo roleRepo;
    
    @Override
    public User saveUser(User user) {
        return userRepo.save(user);

    }

    @Override
    public Role saveRole(Role role) {
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        User user = userRepo.findByUsername(username);
        System.out.println("tst3");
    }



    @Override
    public User getUser(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }
    


}
