package co.com.citrino.citrino.service.impl;

import co.com.citrino.citrino.model.PerfilMetodoPago;
import co.com.citrino.citrino.respository.PerfilMetodoPagoRepository;
import co.com.citrino.citrino.service.PerfilMetodoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilMetodoPagoServiceImpl implements PerfilMetodoPagoService {

    @Autowired
    private PerfilMetodoPagoRepository repository;

    @Override
    public PerfilMetodoPago create(PerfilMetodoPago perfilMetodoPago) {
        return repository.save(perfilMetodoPago);
    }

    @Override
    public PerfilMetodoPago delete(Long id) {
        PerfilMetodoPago perfilMetodoPago = new PerfilMetodoPago();
        perfilMetodoPago.setIdPerfilMetodoPago(id);
        repository.delete(perfilMetodoPago);
        return perfilMetodoPago;
    }

    @Override
    public List findAll() {
        return repository.findAll();
    }

    @Override
    public PerfilMetodoPago findById(Long id) {
        return repository.findByIdPerfilMetodoPago(id);
    }

    @Override
    public PerfilMetodoPago update(PerfilMetodoPago perfilMetodoPago) {
        return null;
    }
}
