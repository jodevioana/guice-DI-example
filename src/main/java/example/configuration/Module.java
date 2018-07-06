package example.configuration;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import example.controller.Controller;
import example.controller.ControllerImpl;
import example.repository.AnimalDao;
import example.repository.AnimalDaoMongoDB;
import example.repository.AnimalDaoSqlServer;

public class Module extends AbstractModule {

    //bind implementation to interfaces
    //if class -> no need to bind - Validator
    @Override
    protected void configure() {
        bind(Controller.class).to(ControllerImpl.class);
        bind(AnimalDao.class).to(AnimalDaoMongoDB.class);
//        bind(AnimalDao.class).to(AnimalDaoSqlServer.class);


//        bind(AnimalDao.class).annotatedWith(Names.named("mongodb")).to(AnimalDaoMongoDB.class);
//        bind(AnimalDao.class).annotatedWith(Names.named("sqlserver")).to(AnimalDaoSqlServer.class);
    }
}
