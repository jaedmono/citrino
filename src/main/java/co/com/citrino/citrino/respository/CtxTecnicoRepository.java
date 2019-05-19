package co.com.citrino.citrino.respository;

import co.com.citrino.citrino.model.CtxTecnico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CtxTecnicoRepository extends JpaRepository<CtxTecnico, Double> {

    void delete(CtxTecnico ctxTecnico);

    List findAll();

    CtxTecnico save(CtxTecnico ctxTecnico);

    CtxTecnico findByIdTecnico(Long idTecnico);
}
