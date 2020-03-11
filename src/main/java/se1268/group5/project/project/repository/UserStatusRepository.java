package se1268.group5.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se1268.group5.project.project.model.UserStatus;

public interface UserStatusRepository extends JpaRepository<UserStatus, Long> {
}
