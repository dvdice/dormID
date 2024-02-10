package utep.kursovaya.dormID.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import utep.kursovaya.dormID.models.Resident;

import java.util.List;

public interface ResidentRepository extends JpaRepository<Resident, Long> {

    List<Resident> findByID(Long id);
}
