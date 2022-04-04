package dev.patika.spring.inheritance.single;

/**
 * Username = baranbuyuk
 * Date = 29.07.2021 22:11
 **/

/**
 * Below topics should mention
 * 1- What is Parent - Child relation
 * 2- What is super() keyword and how it works and what is purpose of it?
 * 3- instance of keyword
 */
public class Main {

    public static void main(String[] args) {

        //We are creating a human instance from Human class.
        var human = new Human("Baran", 50);
        human.showInfo();

        //We are creating a Human instance from Student class.
        //Because we know that the Student class child class of Human.We can say that Student is a Human.
        //View from Inheritance approach we can say that there is IS-A relation between Human and Student class
        var student = new Student("Student", 18);

        //Now, when we call showInfo method, JVM will know that is instance of a Student and JVM will call the showInfo method in the student class.
        student.getStudentNumber();


        // any question?

    }
}
