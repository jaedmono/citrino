package co.com.citrino.citrino.service.impl;

import co.com.citrino.citrino.model.PerfilHorario;
import co.com.citrino.citrino.respository.PerfilHorarioRepository;
import co.com.citrino.citrino.service.PerfilHorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilHorarioServiceImpl implements PerfilHorarioService {

    @Autowired
    private PerfilHorarioRepository repository;

    @Override
    public PerfilHorario create(PerfilHorario perfilHorario) {
        return repository.save(perfilHorario);
    }

    @Override
    public PerfilHorario delete(Long id) {
        PerfilHorario perfilHorario = new PerfilHorario();
        perfilHorario.setIdPerfilHorario(id);
        repository.delete(perfilHorario);
        return perfilHorario;
    }

    @Override
    public List findAll() {
        return repository.findAll();
    }

    @Override
    public PerfilHorario findById(Long id) {
        return repository.findByIdPerfilHorario(id);
    }

    @Override
    public PerfilHorario update(PerfilHorario perfilHorario) {
        return null;
    }
}
