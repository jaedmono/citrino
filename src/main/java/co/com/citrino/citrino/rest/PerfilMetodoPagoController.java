package co.com.citrino.citrino.rest;


import co.com.citrino.citrino.model.PerfilMetodoPago;
import co.com.citrino.citrino.service.PerfilMetodoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/perfil-metodo-pago"})
public class PerfilMetodoPagoController {

    @Autowired
    private PerfilMetodoPagoService service;

    @PostMapping
    public PerfilMetodoPago create(@RequestBody PerfilMetodoPago perfilMetodoPago){
        return service.create(perfilMetodoPago);
    }

    @GetMapping(path = {"/{id}"})
    public PerfilMetodoPago findOne(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @PutMapping
    public PerfilMetodoPago update(@RequestBody PerfilMetodoPago perfilMetodoPago){
        return service.update(perfilMetodoPago);
    }

    @DeleteMapping(path ={"/{id}"})
    public PerfilMetodoPago delete(@PathVariable("id") Long id) {
        return service.delete(id);
    }

    @GetMapping
    public List findAll(){
        return service.findAll();
    }

}
