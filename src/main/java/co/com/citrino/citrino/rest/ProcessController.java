package co.com.citrino.citrino.rest;

import co.com.citrino.citrino.model.Process;
import co.com.citrino.citrino.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import co.com.citrino.citrino.model.Process;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/process"})
public class ProcessController {

    @Autowired
    private ProcessService service;

    @PostMapping
    public Process create(@RequestBody Process process){
        return service.create(process);
    }

    @GetMapping(path = {"/{id}"})
    public Process findOne(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @PutMapping
    public Process update(@RequestBody Process process){
        return service.update(process);
    }

    @DeleteMapping(path ={"/{id}"})
    public Process delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

    @GetMapping
    public List findAll(){
        return service.findAll();
    }
}
