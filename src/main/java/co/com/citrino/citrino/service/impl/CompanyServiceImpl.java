package co.com.citrino.citrino.service.impl;

import co.com.citrino.citrino.model.Company;
import co.com.citrino.citrino.respository.CompanyRepository;
import co.com.citrino.citrino.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository repository;

    @Override
    public Company create(Company user) {
        return repository.save(user);
    }

    @Override
    public Company delete(Long id) {
        Company company = findByIdCompany(id);
        if(company != null){
            repository.delete(company);
        }
        return company;
    }

    @Override
    public List findAll() {
        return repository.findAll();
    }

    @Override
    public Company findByIdCompany(Long id) {
        return repository.findByIdCompany(id);
    }

    @Override
    public Company update(Company company) {
        return null;
    }
}
