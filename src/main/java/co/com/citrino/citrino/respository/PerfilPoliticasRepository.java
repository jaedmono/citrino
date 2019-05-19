package co.com.citrino.citrino.respository;

import co.com.citrino.citrino.model.PerfilPoliticas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerfilPoliticasRepository extends JpaRepository<PerfilPoliticas, Double> {

    void delete(PerfilPoliticas perfilPoliticas);

    List findAll();

    PerfilPoliticas save(PerfilPoliticas perfilPoliticas);

    PerfilPoliticas findByIdPerfilPoliticas(Long idPoliticsProfile);
}
