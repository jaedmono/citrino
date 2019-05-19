package co.com.citrino.citrino.rest;

import co.com.citrino.citrino.model.CtxLocalizacion;
import co.com.citrino.citrino.service.CtxLocalizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/ctx-localizacion"})
public class CtxLocalizacionController {

    @Autowired
    private CtxLocalizacionService service;

    @PostMapping
    public CtxLocalizacion create(@RequestBody CtxLocalizacion ctxLocalizacion){
        return service.create(ctxLocalizacion);
    }

    @GetMapping(path = {"/{id}"})
    public CtxLocalizacion findOne(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @PutMapping
    public CtxLocalizacion update(@RequestBody CtxLocalizacion ctxLocalizacion){
        return service.update(ctxLocalizacion);
    }

    @DeleteMapping(path ={"/{id}"})
    public CtxLocalizacion delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

    @GetMapping
    public List findAll(){
        return service.findAll();
    }



}
