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
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Date dateCreated;
    @Getter
    @Setter
    private Date dateEdited;

    @Getter
    @Setter
    @ManyToMany
    @JoinTable(name="user_work",
            joinColumns = @JoinColumn(name="user_id", referencedColumnName="id"),
            inverseJoinColumns = @JoinColumn(name="work_id", referencedColumnName="id")
    )
    private Set<Work> workSet;

    public Set<Work> getWorks() {
        return workSet;
    }

    public void setWorks(Set<Work> workSet) {
        this.workSet = workSet;
    }

}
