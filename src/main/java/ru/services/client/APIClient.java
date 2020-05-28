package ru.services.client;

import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import io.crnk.client.CrnkClient;
import io.crnk.core.module.SimpleModule;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.Repository;
import io.crnk.core.repository.ResourceRepository;
import io.crnk.data.jpa.JpaModuleConfig;
import ru.services.rest.model.User;
import ru.services.rest.repository.UserRepository;
import sun.net.www.http.HttpClient;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Named("Client")
@SessionScoped
public class APIClient implements Serializable {

    private final String url = "http://localhost:8080/rest-service/rest-jax";

    public void run() {

        CrnkClient client = new CrnkClient(url);

        SimpleModule module = new SimpleModule("jbaModule");
        module.addJacksonModule(new Jdk8Module());
        client.addModule(module);
//        client.setHttpAdapter(new InMemoryHttpAdapter(new CrnkBoot(), url));
//        client.setHttpAdapter(HttpClientAdapter.newInstance());
        ResourceRepository<User, String> usersRepo = client.getRepositoryForType(User.class);
        List<String> interestsObj = new ArrayList<>();
        interestsObj.add("coding");
        interestsObj.add("art");
        Optional<List<String>> interests = Optional.of(interestsObj);
        usersRepo.create(new User(UUID.randomUUID().toString(), "polcar@gmail.com", "polcar", "sergey", "evstafev", interests));
        List<User> users = usersRepo.findAll(new QuerySpec(User.class));

        System.out.println(users.toArray().toString());

    }

}
