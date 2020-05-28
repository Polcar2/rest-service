package ru.services.rest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;
import io.crnk.client.http.apache.HttpClientAdapter;

import java.util.List;
import java.util.Optional;

@JsonApiResource(type = "users",
        postable = true, readable = true, patchable = true, deletable = true, sortable = true, filterable = true)
public class User {

    @JsonApiId
    private String id;

    private String email;

    private String nickname;

    private String firstName;

    private String lastName;

    private Optional<List<String>> interests;

    public User() {
    }

    public User(String id, String email, String nickname, String firstName, String lastName, Optional<List<String>> interests) {
        this.id = id;
        this.email = email;
        this.nickname = nickname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.interests = interests;
    }

    public User(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Optional<List<String>> getInterests() {
        return interests;
    }

    public void setInterests(Optional<List<String>> interests) {
        this.interests = interests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return !(id != null ? !id.equals(user.id) : user.id != null);

    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
