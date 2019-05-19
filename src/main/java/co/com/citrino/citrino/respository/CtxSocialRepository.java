package co.com.citrino.citrino.respository;

import co.com.citrino.citrino.model.CtxSocial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CtxSocialRepository extends JpaRepository<CtxSocial, Double> {

    void delete(CtxSocial ctxSocial);

    List findAll();

    CtxSocial save(CtxSocial ctxSocial);

    CtxSocial findByIdSocial(Long idSocial);
}
