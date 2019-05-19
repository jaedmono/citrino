package co.com.citrino.citrino.service;

import co.com.citrino.citrino.model.PerfilMetodoPago;

import java.util.List;

public interface PerfilMetodoPagoService {

    PerfilMetodoPago create(PerfilMetodoPago perfilMetodoPago) ;

    PerfilMetodoPago delete(Long id) ;

    List findAll() ;

    PerfilMetodoPago findById(Long id) ;

    PerfilMetodoPago update(PerfilMetodoPago perfilMetodoPago) ;
}
