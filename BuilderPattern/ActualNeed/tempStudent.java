package java;

import java.util.List;

public class tempStudent {
    int rollNumber; 
    int age;
    String name;
    String fatherName;
    String motherName;
    List<String> subjects;

    // Main problem- Too many construtors in case of many members

    
    public tempStudent(int rollNumber, int age, String name, String fatherName, String motherName, List<String> subjects){
        this.rollNumber = rollNumber;
        this.age = age;
        this.name= name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.subjects = subjects;
    }
    
    public tempStudent(int rollNumber, String name, String fatherName, String motherName){
        this.rollNumber = rollNumber;
        this.name= name;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }


    public tempStudent(int rollNumber, int age, String name, List<String> subjects){
        this.rollNumber = rollNumber;
        this.age = age;
        this.name= name;
        this.subjects = subjects;
    }

    // Another problem- Below constructors are different but are considered duplicate by compiler due to same defination
    public tempStudent(int rollNumber, String name, String motherName){
        this.rollNumber = rollNumber;
        this.motherName = motherName;
        this.name= name;
    }

    public tempStudent(int rollNumber, String name, String fatherName){
        this.rollNumber = rollNumber;
        this.fatherName = fatherName;
        this.name= name;
    }
}
