package example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import example.configuration.Module;
import example.controller.Controller;

public class Main {


    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Module() );
        Controller controller = injector.getInstance(Controller.class);

        controller.makeAllAnimalSpeak();
        System.out.println("---------------");
        controller.validateAnimals();
    }

}
