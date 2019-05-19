package co.com.citrino.citrino.respository;

import co.com.citrino.citrino.model.CtxLocalizacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CtxLocalizacionRepository extends JpaRepository<CtxLocalizacion, Double>{

        void delete(CtxLocalizacion ctxLocalizacion);

        List findAll();

        CtxLocalizacion save(CtxLocalizacion ctxLocalizacion);

        CtxLocalizacion findByIdLocalizacion(Long id);
}
