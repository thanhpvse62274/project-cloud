package se1268.group5.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se1268.group5.project.project.model.Shoes;

public interface ShoesRepository extends JpaRepository<Shoes, Long> {
}
