package co.com.citrino.citrino.service;

import co.com.citrino.citrino.rest.CtxEspacioTemporal;

import java.util.List;

public interface CtxEspacioTemporalService {

    CtxEspacioTemporal create(CtxEspacioTemporal ctxEspacioTemporal) ;

    CtxEspacioTemporal delete(Long id) ;

    List findAll() ;

    CtxEspacioTemporal findById(Long id) ;

    CtxEspacioTemporal update(CtxEspacioTemporal ctxEspacioTemporal) ;
}
