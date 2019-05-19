package co.com.citrino.citrino.respository;

import co.com.citrino.citrino.model.PerfilEstrategia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PerfilEstrategiaRepository extends JpaRepository<PerfilEstrategia, Double> {

    void delete(PerfilEstrategia user);

    List findAll();

    PerfilEstrategia save(PerfilEstrategia perfil);

    PerfilEstrategia findByIdPest(Long idPest);
}
