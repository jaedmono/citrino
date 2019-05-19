package co.com.citrino.citrino.service.impl;

import co.com.citrino.citrino.model.PerfilEstrategia;
import co.com.citrino.citrino.respository.PerfilEstrategiaRepository;
import co.com.citrino.citrino.service.PerfilEstrategiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilEstrategiaServiceImpl implements PerfilEstrategiaService {

    @Autowired
    private PerfilEstrategiaRepository repository;

    @Override
    public PerfilEstrategia create(PerfilEstrategia perfilEstrategia) {
        return repository.save(perfilEstrategia);
    }

    @Override
    public PerfilEstrategia delete(Long id) {
        PerfilEstrategia perfilEstrategia = new PerfilEstrategia();
        perfilEstrategia.setIdPest(id);
        repository.delete(perfilEstrategia);
        return perfilEstrategia;
    }

    @Override
    public List findAll() {
        return repository.findAll();
    }

    @Override
    public PerfilEstrategia findById(Long id) {
        return repository.findByIdPest(id);
    }

    @Override
    public PerfilEstrategia update(PerfilEstrategia perfilEstrategia) {
        return null;
    }
}
