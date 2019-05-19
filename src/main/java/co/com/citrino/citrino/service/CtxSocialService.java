package co.com.citrino.citrino.service;

import co.com.citrino.citrino.model.CtxSocial;

import java.util.List;

public interface CtxSocialService {

    CtxSocial create(CtxSocial ctxSocial) ;

    CtxSocial delete(Long id) ;

    List findAll() ;

    CtxSocial findById(Long id) ;

    CtxSocial update(CtxSocial ctxSocial) ;
}
