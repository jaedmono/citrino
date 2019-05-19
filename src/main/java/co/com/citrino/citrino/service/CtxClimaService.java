package co.com.citrino.citrino.service;

import co.com.citrino.citrino.model.CtxClima;

import java.util.List;

public interface CtxClimaService {

    CtxClima create(CtxClima ctxClima) ;

    CtxClima delete(Long id) ;

    List findAll() ;

    CtxClima findById(Long id) ;

    CtxClima update(CtxClima ctxClima) ;
}
