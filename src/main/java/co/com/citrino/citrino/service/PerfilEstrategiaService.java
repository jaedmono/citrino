package co.com.citrino.citrino.service;

import co.com.citrino.citrino.model.PerfilEstrategia;

import java.util.List;

public interface PerfilEstrategiaService {

    PerfilEstrategia create(PerfilEstrategia perfilEstrategia) ;

    PerfilEstrategia delete(Long id) ;

    List findAll() ;

    PerfilEstrategia findById(Long id) ;

    PerfilEstrategia update(PerfilEstrategia perfilEstrategia) ;
}
