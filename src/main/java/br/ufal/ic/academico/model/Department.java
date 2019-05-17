package br.ufal.ic.academico.model;

import lombok.Getter;
import org.hibernate.annotations.Tables;

import javax.persistence.*;
import java.util.ArrayList;

@Getter
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    public Department(String name) {
        this.name = name;
    }
//    private ArrayList<Course> courses;
//    private ArrayList<Professor> professors;

}
