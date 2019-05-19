package co.com.citrino.citrino.service;

import co.com.citrino.citrino.model.CtxRegulatorio;

import java.util.List;

public interface CtxRegulatorioService {

    CtxRegulatorio create(CtxRegulatorio ctxRegulatorio) ;

    CtxRegulatorio delete(Long id) ;

    List findAll() ;

    CtxRegulatorio findById(Long id) ;

    CtxRegulatorio update(CtxRegulatorio ctxRegulatorio) ;
}
