package br.ufal.ic.academico.ui;

import br.ufal.ic.academico.model.Department;
import br.ufal.ic.academico.model.Student;
import br.ufal.ic.academico.model.Subject;

public class Ui {
    public void printMenu(){
        System.out.println("Add Department");
        System.out.println("Add Student");
        System.out.println("Add Subject");
        System.out.println("List subjects by department");
        System.out.println("List information by subject");
        System.out.println("List information by student");
    }

    public void listStudents(){ // method to list all student names and registrations

    }

    public void listSubjectsByStudent(Student student){

    }

    public void listRegistrationStatus(){ // show if the student was registered or not

    }

    public void listSubjectByDepartment(Department department){ // show name, code, credit numbers, requirements subj code, minimum code

    }

    public void listSubjectInfo(Subject subject){ // show code, credit numbers, requirement subj codes, min credits, name, professor name, list of students

    }

    public void registrationByStudent(Student student){ //show name, register number, code and number of the subjects which he is registered now

    }
}
