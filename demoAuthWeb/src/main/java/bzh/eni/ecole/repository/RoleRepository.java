package bzh.eni.ecole.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import bzh.eni.ecole.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
