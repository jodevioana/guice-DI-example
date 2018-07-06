package example.repository;

import example.model.Animal;

import java.util.Arrays;
import java.util.List;

public class AnimalDaoMongoDB implements AnimalDao {

    @Override
    public List<Animal> getAnimals() {
        return Arrays.asList(
                new Animal("MongoDB - Dog"),
                new Animal("MongoDB - Cat"),
                new Animal("MongoDB - Elephant"),
                new Animal("MongoDB - Giraffe")
        );
    }
}
