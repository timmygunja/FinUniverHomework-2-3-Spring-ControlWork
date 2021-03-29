package com.example.demo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;


@Entity
@Data
@NoArgsConstructor
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String description;
    @Getter
    @Setter
    private Date dateDone;
    @Getter
    @Setter
    private Boolean isDone;

    @Getter
    @Setter
    private Date dateCreated;
    @Getter
    @Setter
    private Date dateEdited;

    @Getter
    @Setter
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private Set<User> users;

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Getter
    @Setter
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "categories")
    private Set<Category> categories;

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

}
