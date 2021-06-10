package br.com.geovanegjunior.hruser.repositories;

import br.com.geovanegjunior.hruser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
