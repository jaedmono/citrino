package co.com.citrino.citrino.service;

import co.com.citrino.citrino.model.Industry;

import java.util.List;

public interface IndustryService {

    Industry create(Industry industry) ;

    Industry delete(Long id) ;

    List findAll() ;

    Industry findById(Long id) ;

    Industry update(Industry industry) ;
}
