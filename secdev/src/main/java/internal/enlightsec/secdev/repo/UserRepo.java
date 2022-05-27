package internal.enlightsec.secdev.repo;

import internal.enlightsec.secdev.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
