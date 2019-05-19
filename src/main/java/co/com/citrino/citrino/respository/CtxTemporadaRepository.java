package co.com.citrino.citrino.respository;

import co.com.citrino.citrino.model.CtxTemporada;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CtxTemporadaRepository extends JpaRepository<CtxTemporada, Double> {

    void delete(CtxTemporada ctxTemporada);

    List findAll();

    CtxTemporada save(CtxTemporada ctxTemporada);

    CtxTemporada findByIdSeason(Long idSeason);
}
