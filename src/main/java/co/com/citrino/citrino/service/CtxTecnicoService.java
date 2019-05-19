package co.com.citrino.citrino.service;

import co.com.citrino.citrino.model.CtxTecnico;

import java.util.List;

public interface CtxTecnicoService {

    CtxTecnico create(CtxTecnico ctxTecnico) ;

    CtxTecnico delete(Long id) ;

    List findAll() ;

    CtxTecnico findById(Long id) ;

    CtxTecnico update(CtxTecnico company) ;
}
