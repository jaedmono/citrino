package co.com.citrino.citrino.rest;

import co.com.citrino.citrino.model.PerfilEstrategia;
import co.com.citrino.citrino.service.PerfilEstrategiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/perfil-estrategia"})
public class PerfilEstrategiaController {

    @Autowired
    private PerfilEstrategiaService service;

    @PostMapping
    public PerfilEstrategia create(@RequestBody PerfilEstrategia perfilEstrategia){
        return service.create(perfilEstrategia);
    }

    @GetMapping(path = {"/{id}"})
    public PerfilEstrategia findOne(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @PutMapping
    public PerfilEstrategia update(@RequestBody PerfilEstrategia perfilEstrategia){
        return service.update(perfilEstrategia);
    }

    @DeleteMapping(path ={"/{id}"})
    public PerfilEstrategia delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

    @GetMapping
    public List findAll(){
        return service.findAll();
    }
}
