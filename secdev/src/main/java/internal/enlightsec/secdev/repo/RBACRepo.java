package internal.enlightsec.secdev.repo;

import internal.enlightsec.secdev.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;


// Den här pratar med 
public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
