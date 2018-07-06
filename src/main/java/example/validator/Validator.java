package example.validator;

import example.model.Animal;

public class Validator {

    public boolean validateAnimal(Animal animal) {
        return (Math.random() * 10) < 5;
    }
}
