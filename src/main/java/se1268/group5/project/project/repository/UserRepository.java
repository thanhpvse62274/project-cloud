package se1268.group5.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se1268.group5.project.project.model.User;

public interface UserRepository  extends JpaRepository<User,String> {

}
