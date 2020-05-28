package ru.services;
import io.crnk.core.engine.transaction.TransactionRunner;
import io.crnk.home.HomeModule;
import io.crnk.data.jpa.JpaModule;
import io.crnk.data.jpa.JpaModuleConfig;
import ru.services.rest.repository.UserRepository;
import io.crnk.client.http.apache.HttpClientAdapter;


import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class APIProducer {

    @PersistenceContext
    private EntityManager em;

    @Produces
    @ApplicationScoped
    public HomeModule produceHomeModule() {
        return HomeModule.create();
    }

    @Produces
    @ApplicationScoped
    public JpaModule produceJpaModule(TransactionRunner transactionRunner) {
        JpaModuleConfig config = new JpaModuleConfig();
        return JpaModule.createServerModule(config, em, transactionRunner);
    }


//    @Produces
    @ApplicationScoped
    public UserRepository userRepository() {
        return new UserRepository();
    }
}