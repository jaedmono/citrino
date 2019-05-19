package co.com.citrino.citrino.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import co.com.citrino.citrino.model.Process;

import java.util.List;

public interface ProcessRepository extends JpaRepository<Process, Double> {

    void delete(Process process);

    List findAll();

    Process save(Process process);

    Process findById(Long idProcess);
}
