package se1268.group5.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se1268.group5.project.project.model.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
