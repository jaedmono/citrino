package co.com.citrino.citrino.service.impl;

import co.com.citrino.citrino.model.CtxSocial;
import co.com.citrino.citrino.respository.CtxSocialRepository;
import co.com.citrino.citrino.service.CtxSocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CtxSocialServiceImpl implements CtxSocialService {

    @Autowired
    private CtxSocialRepository repository;

    @Override
    public CtxSocial create(CtxSocial ctxSocial) {
        return repository.save(ctxSocial);
    }

    @Override
    public CtxSocial delete(Long id) {
        CtxSocial ctxSocial = new CtxSocial();
        ctxSocial.setIdSocial(id);
        repository.delete(ctxSocial);
        return ctxSocial;
    }

    @Override
    public List findAll() {
        return repository.findAll();
    }

    @Override
    public CtxSocial findById(Long id) {
        return repository.findByIdSocial(id);
    }

    @Override
    public CtxSocial update(CtxSocial ctxSocial) {
        return null;
    }
}
