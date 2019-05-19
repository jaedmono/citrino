package co.com.citrino.citrino.service;

import co.com.citrino.citrino.model.CtxLocalizacion;

import java.util.List;

public interface CtxLocalizacionService {

    CtxLocalizacion create(CtxLocalizacion ctxLocalizacion) ;

    CtxLocalizacion delete(Long id) ;

    List findAll() ;

    CtxLocalizacion findById(Long id) ;

    CtxLocalizacion update(CtxLocalizacion ctxLocalizacion) ;
}
