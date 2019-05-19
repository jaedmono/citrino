package co.com.citrino.citrino.service.impl;

import co.com.citrino.citrino.model.PerfilPoliticas;
import co.com.citrino.citrino.respository.PerfilPoliticasRepository;
import co.com.citrino.citrino.service.PerfilPoliticasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilPoliticasServiceImpl implements PerfilPoliticasService {

    @Autowired
    private PerfilPoliticasRepository repository;

    @Override
    public PerfilPoliticas create(PerfilPoliticas perfilPoliticas) {
        return repository.save(perfilPoliticas);
    }

    @Override
    public PerfilPoliticas delete(Long id) {
        PerfilPoliticas perfilPoliticas = new PerfilPoliticas();
        perfilPoliticas.setIdPerfilPoliticas(id);
        repository.delete(perfilPoliticas);
        return perfilPoliticas;
    }

    @Override
    public List findAll() {
        return repository.findAll();
    }

    @Override
    public PerfilPoliticas findById(Long id) {
        return repository.findByIdPerfilPoliticas(id);
    }

    @Override
    public PerfilPoliticas update(PerfilPoliticas perfilPoliticas) {
        return null;
    }
}
