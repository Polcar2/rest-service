package ru.services;

import io.crnk.rs.CrnkFeature;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.HashSet;
import java.util.Set;

/**
 * Конфигурация REST
 */
@ApplicationPath("rest-jax")
public class APIApplication extends Application{

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<>();
        set.add(CrnkFeature.class);
        return set;
    }
}
