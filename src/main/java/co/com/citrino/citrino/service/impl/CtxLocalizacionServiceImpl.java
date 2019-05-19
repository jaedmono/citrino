package co.com.citrino.citrino.service.impl;

import co.com.citrino.citrino.model.CtxLocalizacion;
import co.com.citrino.citrino.respository.CtxLocalizacionRepository;
import co.com.citrino.citrino.service.CtxLocalizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CtxLocalizacionServiceImpl implements CtxLocalizacionService {

    @Autowired
    private CtxLocalizacionRepository repository;

    @Override
    public CtxLocalizacion create(CtxLocalizacion ctxLocalizacion) {
        return repository.save(ctxLocalizacion);
    }

    @Override
    public CtxLocalizacion delete(Long id) {
        CtxLocalizacion ctxLocalizacion = new CtxLocalizacion();
        ctxLocalizacion.setIdLocalizacion(id);
        repository.delete(ctxLocalizacion);
        return ctxLocalizacion;
    }

    @Override
    public List findAll() {
        return repository.findAll();
    }

    @Override
    public CtxLocalizacion findById(Long id) {
        return repository.findByIdLocalizacion(id);
    }

    @Override
    public CtxLocalizacion update(CtxLocalizacion ctxLocalizacion) {
        return repository.save(ctxLocalizacion);
    }
}
