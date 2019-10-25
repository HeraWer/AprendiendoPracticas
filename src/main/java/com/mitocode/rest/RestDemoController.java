package com.mitocode.rest;


import com.mitocode.model.Persona;
import com.mitocode.repo.IPersonaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/personas")
public class RestDemoController {

    @Autowired
    private IPersonaRepo repo;

    @GetMapping
    public List<Persona> listar(){
        return repo.findAll();
    }

    @PostMapping
    public void insertar(@RequestBody Persona per){
        repo.save(per);
    }

    @PutMapping
    public void modificar(@RequestBody Persona per){
        repo.save(per);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        Persona found = repo.findById(0).orElseThrow(() -> new RuntimeException());
        repo.delete(found);
    }
}
