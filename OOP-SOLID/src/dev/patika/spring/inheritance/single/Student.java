package dev.patika.spring.inheritance.single;

/**
 * Username = baranbuyuk
 * Date = 29.07.2021 22:09
 **/
public class Student extends Human {


    public Student(String name, int age) {
        super(name, age);
    }

    public Integer getStudentNumber() {
        return 10123;
    }


}
