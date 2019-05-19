package co.com.citrino.citrino.service.impl;

import co.com.citrino.citrino.model.CtxRegulatorio;
import co.com.citrino.citrino.respository.CtxRegulatorioRepository;
import co.com.citrino.citrino.service.CtxRegulatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CtxRegulatorioServiceImpl implements CtxRegulatorioService {

    @Autowired
    private CtxRegulatorioRepository repository;

    @Override
    public CtxRegulatorio create(CtxRegulatorio ctxRegulatorio) {
        return repository.save(ctxRegulatorio);
    }

    @Override
    public CtxRegulatorio delete(Long id) {
        CtxRegulatorio ctxRegulatorio = new CtxRegulatorio();
        ctxRegulatorio.setIdRegulatorio(id);
        repository.delete(ctxRegulatorio);
        return ctxRegulatorio;
    }

    @Override
    public List findAll() {
        return repository.findAll();
    }

    @Override
    public CtxRegulatorio findById(Long id) {
        return repository.findByIdRegulatorio(id);
    }

    @Override
    public CtxRegulatorio update(CtxRegulatorio ctxRegulatorio) {
        return null;
    }
}
