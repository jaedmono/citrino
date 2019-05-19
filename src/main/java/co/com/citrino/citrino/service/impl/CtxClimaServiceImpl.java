package co.com.citrino.citrino.service.impl;

import co.com.citrino.citrino.model.CtxClima;
import co.com.citrino.citrino.respository.CtxClimaRepository;
import co.com.citrino.citrino.service.CtxClimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CtxClimaServiceImpl implements CtxClimaService {

    @Autowired
    private CtxClimaRepository repository;

    @Override
    public CtxClima create(CtxClima ctxClima) {
        return repository.save(ctxClima);
    }

    @Override
    public CtxClima delete(Long id) {
        CtxClima ctxClima = new CtxClima();
        ctxClima.setIdClima(id);
        repository.delete(ctxClima);
        return ctxClima;
    }

    @Override
    public List findAll() {
        return repository.findAll();
    }

    @Override
    public CtxClima findById(Long id) {
        return repository.findByIdClima(id);
    }

    @Override
    public CtxClima update(CtxClima ctxClima) {
        return repository.save(ctxClima);
    }
}
