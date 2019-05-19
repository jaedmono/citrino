package co.com.citrino.citrino.respository;

import co.com.citrino.citrino.model.CtxRegulatorio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CtxRegulatorioRepository extends JpaRepository<CtxRegulatorio, Double> {

    void delete(CtxRegulatorio ctxRegulatorio);

    List findAll();

    CtxRegulatorio save(CtxRegulatorio ctxRegulatorio);

    CtxRegulatorio findByIdRegulatorio(Long id);
}
