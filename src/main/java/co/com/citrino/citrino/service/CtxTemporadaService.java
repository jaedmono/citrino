package co.com.citrino.citrino.service;

import co.com.citrino.citrino.model.CtxTemporada;

import java.util.List;

public interface CtxTemporadaService {

    CtxTemporada create(CtxTemporada ctxTemporada) ;

    CtxTemporada delete(Long id) ;

    List findAll() ;

    CtxTemporada findById(Long id) ;

    CtxTemporada update(CtxTemporada ctxTemporada) ;
}
