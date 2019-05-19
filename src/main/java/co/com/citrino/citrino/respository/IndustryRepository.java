package co.com.citrino.citrino.respository;

import co.com.citrino.citrino.model.Industry;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IndustryRepository extends JpaRepository<Industry, Double> {

    void delete(Industry user);

    List findAll();

    Industry save(Industry user);

    Industry findByIdInd(Long idCOmpany);
}
