package co.com.citrino.citrino.service;

import co.com.citrino.citrino.model.Company;

import java.util.List;


public interface CompanyService {

    Company create(Company user) ;

    Company delete(Long id) ;

    List findAll() ;

    Company findByIdCompany(Long id) ;

    Company update(Company company) ;
}
