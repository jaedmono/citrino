package co.com.citrino.citrino.rest;

import co.com.citrino.citrino.model.CtxRegulatorio;
import co.com.citrino.citrino.service.CtxRegulatorioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/ctx-regulatorio"})
public class CtxRegulatorioController {

    @Autowired
    private CtxRegulatorioService service;

    @PostMapping
    public CtxRegulatorio create(@RequestBody CtxRegulatorio ctxRegulatorio){
        return service.create(ctxRegulatorio);
    }

    @GetMapping(path = {"/{id}"})
    public CtxRegulatorio findOne(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @PutMapping
    public CtxRegulatorio update(@RequestBody CtxRegulatorio ctxRegulatorio){
        return service.update(ctxRegulatorio);
    }

    @DeleteMapping(path ={"/{id}"})
    public CtxRegulatorio delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

    @GetMapping
    public List findAll(){
        return service.findAll();
    }

}
