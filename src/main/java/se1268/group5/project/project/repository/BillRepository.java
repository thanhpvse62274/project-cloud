package se1268.group5.project.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se1268.group5.project.project.model.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
