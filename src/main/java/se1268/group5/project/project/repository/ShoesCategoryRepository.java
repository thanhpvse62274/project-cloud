package se1268.group5.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se1268.group5.project.project.model.ShoesCategory;

@Repository
public interface ShoesCategoryRepository extends JpaRepository<ShoesCategory, Long> {

}
