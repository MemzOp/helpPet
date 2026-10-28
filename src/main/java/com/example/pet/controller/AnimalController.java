package com.example.pet.controller;

import com.example.pet.entity.Animal;
import com.example.pet.service.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animais")
public class AnimalController {

    private final AnimalService service;
    public AnimalController(AnimalService service) {
        this.service = service;
    }

    @GetMapping
    public List<Animal> mostrarAnimais(){
        return service.mostrarAnimais();
    }

    @PostMapping
    public void criarAnimal(@RequestBody Animal a){
        service.cadastrarAnimal(a);
    }

}

