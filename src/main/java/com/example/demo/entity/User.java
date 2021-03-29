package com.example.demo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String login;
    @Getter
    @Setter
    private String firstName;
    @Getter
    @Setter
    private String lastName;
    @Getter
    @Setter
    private String patronymic;
    @Getter
    @Setter
    private Date birthDate;

    @Getter
    @Setter
    private Date dateCreated;
    @Getter
    @Setter
    private Date dateEdited;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "work_id", nullable = false)
    private Work work;

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

}
