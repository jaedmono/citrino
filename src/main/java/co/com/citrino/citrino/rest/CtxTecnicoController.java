package co.com.citrino.citrino.rest;


import co.com.citrino.citrino.model.CtxTecnico;
import co.com.citrino.citrino.service.CtxTecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/ctx-tecnico"})
public class CtxTecnicoController {

    @Autowired
    private CtxTecnicoService service;

    @PostMapping
    public CtxTecnico create(@RequestBody CtxTecnico ctxTecnico){
        return service.create(ctxTecnico);
    }

    @GetMapping(path = {"/{id}"})
    public CtxTecnico findOne(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @PutMapping
    public CtxTecnico update(@RequestBody CtxTecnico ctxTecnico){
        return service.update(ctxTecnico);
    }

    @DeleteMapping(path ={"/{id}"})
    public CtxTecnico delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

    @GetMapping
    public List findAll(){
        return service.findAll();
    }
}
