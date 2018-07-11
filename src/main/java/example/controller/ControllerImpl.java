package example.controller;

import com.google.inject.Inject;
import example.model.Animal;
import example.repository.AnimalDao;
import example.validator.Validator;

import java.util.List;

public class ControllerImpl implements Controller {

    @Inject
    private AnimalDao animalDao;

    @Inject
    private Validator validator;

    @Override
    public void validateAnimals() {
        List<Animal> allAnimals = animalDao.getAnimals();
        allAnimals.forEach(animal -> {
            boolean isAnimalValid = validator.validateAnimal(animal);
            System.out.println(animal.getName() + " valid? - " + isAnimalValid);
        });
    }

    @Override
    public void makeAllAnimalSpeak() {
        List<Animal> allAnimals = animalDao.getAnimals();
        allAnimals.forEach(animal -> System.out.println(animal.getName() + " - I am speaking!"));
    }
}
