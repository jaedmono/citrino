package co.com.citrino.citrino.rest;

import co.com.citrino.citrino.model.PerfilPoliticas;
import co.com.citrino.citrino.service.PerfilPoliticasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/perfil-politicas"})
public class PerfilPoliticasController {

    @Autowired
    private PerfilPoliticasService service;

    @PostMapping
    public PerfilPoliticas create(@RequestBody PerfilPoliticas perfilPoliticas){
        return service.create(perfilPoliticas);
    }

    @GetMapping(path = {"/{id}"})
    public PerfilPoliticas findOne(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @PutMapping
    public PerfilPoliticas update(@RequestBody PerfilPoliticas perfilPoliticas){
        return service.update(perfilPoliticas);
    }

    @DeleteMapping(path ={"/{id}"})
    public PerfilPoliticas delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

    @GetMapping
    public List findAll(){
        return service.findAll();
    }
}
