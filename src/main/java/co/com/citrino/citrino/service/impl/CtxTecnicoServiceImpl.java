package co.com.citrino.citrino.service.impl;

import co.com.citrino.citrino.model.CtxTecnico;
import co.com.citrino.citrino.respository.CtxTecnicoRepository;
import co.com.citrino.citrino.service.CtxTecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CtxTecnicoServiceImpl implements CtxTecnicoService {

    @Autowired
    private CtxTecnicoRepository repository;

    @Override
    public CtxTecnico create(CtxTecnico ctxTecnico) {
        return repository.save(ctxTecnico);
    }

    @Override
    public CtxTecnico delete(Long id) {
        CtxTecnico ctxTecnico = new CtxTecnico();
        ctxTecnico.setIdTecnico(id);
        repository.delete(ctxTecnico);
        return ctxTecnico;
    }

    @Override
    public List findAll() {
        return repository.findAll();
    }

    @Override
    public CtxTecnico findById(Long id) {
        return repository.findByIdTecnico(id);
    }

    @Override
    public CtxTecnico update(CtxTecnico company) {
        return null;
    }
}
