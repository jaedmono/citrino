package co.com.citrino.citrino.service;

import co.com.citrino.citrino.model.PerfilPoliticas;

import java.util.List;

public interface PerfilPoliticasService {

    PerfilPoliticas create(PerfilPoliticas perfilPoliticas) ;

    PerfilPoliticas delete(Long id) ;

    List findAll() ;

    PerfilPoliticas findById(Long id) ;

    PerfilPoliticas update(PerfilPoliticas perfilPoliticas) ;
}
