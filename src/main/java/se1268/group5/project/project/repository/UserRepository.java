package se1268.group5.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se1268.group5.project.project.model.User;

import java.util.Optional;


@Repository
public interface UserRepository  extends JpaRepository<User,String> {
    Optional<User> getUserByUserNameAndPassword(String username, String password);
    Optional<User> findUserByUserName(String username);
}
