package co.com.citrino.citrino.respository;

import co.com.citrino.citrino.model.CtxClima;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CtxClimaRepository extends JpaRepository<CtxClima, Double> {

    void delete(CtxClima ctxClima);

    List findAll();

    CtxClima save(CtxClima ctxClima);

    CtxClima findByIdClima(Long id);
}
