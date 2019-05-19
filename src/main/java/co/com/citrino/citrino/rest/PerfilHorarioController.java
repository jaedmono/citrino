package co.com.citrino.citrino.rest;

import co.com.citrino.citrino.model.PerfilHorario;
import co.com.citrino.citrino.service.PerfilHorarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/perfil-horario"})
public class PerfilHorarioController {

    @Autowired
    private PerfilHorarioService service;

    @PostMapping
    public PerfilHorario create(@RequestBody PerfilHorario perfilHorario){
        return service.create(perfilHorario);
    }

    @GetMapping(path = {"/{id}"})
    public PerfilHorario findOne(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @PutMapping
    public PerfilHorario update(@RequestBody PerfilHorario perfilHorario){
        return service.update(perfilHorario);
    }

    @DeleteMapping(path ={"/{id}"})
    public PerfilHorario delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

    @GetMapping
    public List findAll(){
        return service.findAll();
    }
}
