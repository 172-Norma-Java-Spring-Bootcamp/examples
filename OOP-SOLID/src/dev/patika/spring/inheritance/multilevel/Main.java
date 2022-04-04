package dev.patika.spring.inheritance.multilevel;

import dev.patika.spring.inheritance.single.Human;
import dev.patika.spring.inheritance.single.Student;

/**
 * Username = baranbuyuk
 * Date = 29.07.2021 22:32
 **/
public class Main {

    public static void main(String[] args) {

        Human human = new Human("Human", 50);
        human.showInfo();

        Human student = new Student("Student", 18);
        student.showInfo();

        // mention about the super keyword in showInfo() method in the engineering student class
        Human engineeringStudent = new EngineeringStudent("EngineeringStudent", 22);
        engineeringStudent.showInfo();

        // if we can look from multiple inheritance view, Human is Base Class, The Student is intermediatory Class and Engineering Student is Derived Class
        // in addition to, Student is-a human, Engineering is a Student and also is a human.

        // any question?


    }
}
