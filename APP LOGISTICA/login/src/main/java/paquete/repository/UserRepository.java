package paquete.repository;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import paquete.model.User;

public interface UserRepository extends JpaRepository <User, Long> {

User findByUsername(String username);
}
