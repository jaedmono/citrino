package co.com.citrino.citrino.rest;

import co.com.citrino.citrino.model.CtxClima;
import co.com.citrino.citrino.service.CtxClimaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/ctx-clima"})
public class CtxClimaController {

    @Autowired
    private CtxClimaService service;

    @PostMapping
    public CtxClima create(@RequestBody CtxClima company){
        return service.create(company);
    }

    @GetMapping(path = {"/{id}"})
    public CtxClima findOne(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @PutMapping
    public CtxClima update(@RequestBody CtxClima company){
        return service.update(company);
    }

    @DeleteMapping(path ={"/{id}"})
    public CtxClima delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

    @GetMapping
    public List findAll(){
        return service.findAll();
    }

}
