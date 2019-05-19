package co.com.citrino.citrino.rest;

import co.com.citrino.citrino.model.CtxSocial;
import co.com.citrino.citrino.service.CtxSocialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/ctx-social"})
public class CtxSocialController {

    @Autowired
    private CtxSocialService service;

    @PostMapping
    public CtxSocial create(@RequestBody CtxSocial ctxSocial){
        return service.create(ctxSocial);
    }

    @GetMapping(path = {"/{id}"})
    public CtxSocial findOne(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @PutMapping
    public CtxSocial update(@RequestBody CtxSocial ctxSocial){
        return service.update(ctxSocial);
    }

    @DeleteMapping(path ={"/{id}"})
    public CtxSocial delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

    @GetMapping
    public List findAll(){
        return service.findAll();
    }

}
