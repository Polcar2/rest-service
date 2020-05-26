package ru.services.client;

import io.crnk.client.CrnkClient;
import io.crnk.client.http.apache.HttpClientAdapter;
import io.crnk.client.http.inmemory.InMemoryHttpAdapter;
import io.crnk.core.boot.CrnkBoot;
import io.crnk.core.queryspec.QuerySpec;
import io.crnk.core.repository.ResourceRepository;
import ru.services.rest.model.User;
import ru.services.rest.repository.UserRepository;

import javax.inject.Named;
import java.util.List;

@Named("Client")
public class APIClient {

    private final String url = "http://localhost:7001/rest-service/rest-jax/";

    public void getObject() {

        CrnkClient client = new CrnkClient(url);
        client.setHttpAdapter(new HttpClientAdapter());
//        client.setHttpAdapter(new InMemoryHttpAdapter(new CrnkBoot(), url));
        UserRepository repository = new UserRepository();
        ResourceRepository<User, String> usersRepo = client.getRepositoryForType(User.class);
        List<User> users = repository.findAll(new QuerySpec(User.class));

        System.out.println(users.toArray().toString());

    }

}
