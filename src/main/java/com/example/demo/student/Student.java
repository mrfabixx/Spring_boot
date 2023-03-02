package com.example.demo.student;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Student {
       @Id
        @SequenceGenerator(
                name = "student_sequence",
                sequenceName = "student_sequence",
                allocationSize = 1
        )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private String name;
     private Long id ;
     private Integer age;
     private LocalDate date_of_birth;
     private String email;


    public Student() {
    }

    public Student(String name, Integer age, LocalDate date_of_birth, String email) {   // without the id
        this.name = name;
        this.age = age;
        this.date_of_birth = date_of_birth;
        this.email = email;
    }

    public Student(Long id, String name, Integer age, LocalDate date_of_birth, String email){    // with all attributes
        this.id=id;
        this.name=name;
        this.age=age;
        this.date_of_birth=date_of_birth;
        this.email=email;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(LocalDate date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", date_of_birth=" + date_of_birth +
                ", email='" + email + '\'' +
                '}';
    }



}
