package br.ufal.ic.academico.model;

import java.util.ArrayList;

public class Subject {

    private String name;
    private String code;
    private Professor professor;
    //ENUM TYPE TO OBRIGATORY AND ELECTIVE
    private Integer minCredits;
    private Integer minutes;

    private ArrayList<Subject> requirements;
    private Department department;

    public Subject(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
