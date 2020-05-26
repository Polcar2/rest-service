package ru.services.rest.model;

import io.crnk.core.resource.annotations.JsonApiId;
import io.crnk.core.resource.annotations.JsonApiResource;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@JsonApiResource(type = "users")
public class User {

    @JsonApiId
    private String id;

    private String email;

    private String nickname;

    private String firstName;

    private String lastName;

    private Optional<List<String>> interests;

    private TestClass other;



    public User() {
    }

    public User(String id, String email, String nickname, String firstName, String lastName, Optional<List<String>> interests, TestClass other) {
        this.id = id;
        this.email = email;
        this.nickname = nickname;
        this.firstName = firstName;
        this.lastName = lastName;
        this.interests = interests;
        this.other = other;
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

    public TestClass getOther() {
        return other;
    }

    public void setOther(TestClass other) {
        this.other = other;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(email, user.email) &&
                Objects.equals(nickname, user.nickname) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(interests, user.interests) &&
                Objects.equals(other, user.other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, nickname, firstName, lastName, interests, other);
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", nickname='" + nickname + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", interests=" + interests +
                ", other=" + other +
                '}';
    }
}
