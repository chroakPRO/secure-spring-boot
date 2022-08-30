package internal.enlightsec.secdev.repo;

import internal.enlightsec.secdev.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;


// Den här pratar med 
public interface RBACRepo {
    Role findByName(String name);
}
