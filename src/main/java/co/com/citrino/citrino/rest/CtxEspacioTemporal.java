package co.com.citrino.citrino.rest;

import co.com.citrino.citrino.model.CtxLocalizacion;
import co.com.citrino.citrino.service.CtxClimaService;
import co.com.citrino.citrino.service.CtxEspacioTemporalService;
import co.com.citrino.citrino.service.CtxLocalizacionService;
import co.com.citrino.citrino.service.CtxTemporadaService;
import co.com.citrino.citrino.service.impl.CtxEspacioTemporalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/ctx-espacio-temporal"})
public class CtxEspacioTemporal {

    @Autowired
    private CtxEspacioTemporalService service;

    @PostMapping
    public CtxEspacioTemporal create(@RequestBody CtxEspacioTemporal ctxLocalizacion){
        return service.create(ctxLocalizacion);
    }

    @GetMapping(path = {"/{id}"})
    public CtxEspacioTemporal findOne(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @PutMapping
    public CtxEspacioTemporal update(@RequestBody CtxEspacioTemporal ctxLocalizacion){
        return service.update(ctxLocalizacion);
    }

    @DeleteMapping(path ={"/{id}"})
    public CtxEspacioTemporal delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

    @GetMapping
    public List findAll(){
        return service.findAll();
    }

}
