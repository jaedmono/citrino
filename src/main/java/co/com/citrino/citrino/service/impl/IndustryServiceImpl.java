package co.com.citrino.citrino.service.impl;

import co.com.citrino.citrino.model.Industry;
import co.com.citrino.citrino.respository.IndustryRepository;
import co.com.citrino.citrino.service.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndustryServiceImpl implements IndustryService {

    @Autowired
    private IndustryRepository repository;

    @Override
    public Industry create(Industry industry) {
        return repository.save(industry);
    }

    @Override
    public Industry delete(Long id) {
        Industry industry = new Industry();
        industry.setIdInd(id);
        repository.delete(industry);
        return industry;
    }

    @Override
    public List findAll() {
        return repository.findAll();
    }

    @Override
    public Industry findById(Long id) {
        return repository.findByIdInd(id);
    }

    @Override
    public Industry update(Industry industry) {
        return null;
    }
}
