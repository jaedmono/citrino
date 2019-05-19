package co.com.citrino.citrino.rest;

import co.com.citrino.citrino.model.CtxTemporada;
import co.com.citrino.citrino.service.CtxTemporadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/ctx-temporal"})
public class CtxTemporadaController {

    @Autowired
    private CtxTemporadaService service;

    @PostMapping
    public CtxTemporada create(@RequestBody CtxTemporada ctxTemporada){
        return service.create(ctxTemporada);
    }

    @GetMapping(path = {"/{id}"})
    public CtxTemporada findOne(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @PutMapping
    public CtxTemporada update(@RequestBody CtxTemporada ctxTemporada){
        return service.update(ctxTemporada);
    }

    @DeleteMapping(path ={"/{id}"})
    public CtxTemporada delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

    @GetMapping
    public List findAll(){
        return service.findAll();
    }
}
