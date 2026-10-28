package com.example.pet.service;

import com.example.pet.entity.Animal;
import com.example.pet.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {


   private final AnimalRepository repository;
    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }

    public List<Animal> mostrarAnimais(){
        List<Animal> animaisList = new ArrayList<>();
        return animaisList = repository.findAll();
    }

    public void cadastrarAnimal(Animal animais){
        Animal animal = new Animal();
        animal.setNome(animais.getNome());
        animal.setCastrado(animais.isCastrado());
        animal.setEspecie(animais.getEspecie());
        animal.setRaca(animais.getRaca());
        animal.setSexo(animais.getSexo());
        animal.setDataNascimento(animais.getDataNascimento());
        animal.setCor(animais.getCor());
        animal.setPeso(animais.getPeso());
        repository.save(animais);
    }
}
