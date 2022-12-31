package pl.edu.agh.to.cinemawiet.screening.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.agh.to.cinemawiet.screening.model.Screening;

@Repository
public interface ScreeningRepository extends JpaRepository<Screening, Long> {

}
