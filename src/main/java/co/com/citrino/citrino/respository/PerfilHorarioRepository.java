package co.com.citrino.citrino.respository;

import co.com.citrino.citrino.model.PerfilHorario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerfilHorarioRepository  extends JpaRepository<PerfilHorario, Double> {

    void delete(PerfilHorario user);

    List findAll();

    PerfilHorario save(PerfilHorario user);

    PerfilHorario findByIdPerfilHorario(Long id);
}
