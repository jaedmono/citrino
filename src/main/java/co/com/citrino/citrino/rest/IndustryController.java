package co.com.citrino.citrino.rest;

import co.com.citrino.citrino.model.Industry;
import co.com.citrino.citrino.service.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/industry"})
public class IndustryController {

    @Autowired
    private IndustryService service;

    @PostMapping
    public Industry create(@RequestBody Industry industry){
        return service.create(industry);
    }

    @GetMapping(path = {"/{id}"})
    public Industry findOne(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @PutMapping
    public Industry update(@RequestBody Industry industry){
        return service.update(industry);
    }

    @DeleteMapping(path ={"/{id}"})
    public Industry delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

    @GetMapping
    public List findAll(){
        return service.findAll();
    }

}
