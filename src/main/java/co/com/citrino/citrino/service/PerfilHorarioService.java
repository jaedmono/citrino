package co.com.citrino.citrino.service;

import co.com.citrino.citrino.model.PerfilHorario;

import java.util.List;

public interface PerfilHorarioService {

    PerfilHorario create(PerfilHorario perfilHorario) ;

    PerfilHorario delete(Long id) ;

    List findAll() ;

    PerfilHorario findById(Long id) ;

    PerfilHorario update(PerfilHorario perfilHorario) ;
}
