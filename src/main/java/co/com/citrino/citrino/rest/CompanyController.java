package co.com.citrino.citrino.rest;

import co.com.citrino.citrino.model.Company;
import co.com.citrino.citrino.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/company"})
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    public Company create(@RequestBody Company company){
        return companyService.create(company);
    }

    @GetMapping(path = {"/{id}"})
    public Company findOne(@PathVariable("id") Long id){
        return companyService.findByIdCompany(id);
    }

    @PutMapping
    public Company update(@RequestBody Company company){
        return companyService.update(company);
    }

    @DeleteMapping(path ={"/{id}"})
    public Company delete(@PathVariable("id") Long id) {
        return companyService.delete(id);
    }

    @GetMapping
    public List findAll(){
        return companyService.findAll();
    }


}
