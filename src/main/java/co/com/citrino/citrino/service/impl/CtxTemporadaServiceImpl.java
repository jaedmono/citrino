package co.com.citrino.citrino.service.impl;

import co.com.citrino.citrino.model.CtxTemporada;
import co.com.citrino.citrino.respository.CtxTemporadaRepository;
import co.com.citrino.citrino.service.CtxTemporadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CtxTemporadaServiceImpl implements CtxTemporadaService {

    @Autowired
    private CtxTemporadaRepository repository;

    @Override
    public CtxTemporada create(CtxTemporada ctxTemporada) {
        return repository.save(ctxTemporada);
    }

    @Override
    public CtxTemporada delete(Long id) {
        CtxTemporada ctxTemporada = new CtxTemporada();
        ctxTemporada.setIdSeason(id);
        repository.delete(ctxTemporada);
        return ctxTemporada;
    }

    @Override
    public List findAll() {
        return repository.findAll();
    }

    @Override
    public CtxTemporada findById(Long id) {
        return repository.findByIdSeason(id);
    }

    @Override
    public CtxTemporada update(CtxTemporada ctxTemporada) {
        return null;
    }
}
