package dev.patika.spring.inheritance.hiyerarchical;


import dev.patika.spring.inheritance.single.Human;

/**
 * Username = baranbuyuk
 * Date = 29.07.2021 22:41
 **/
public class Teacher extends Human {

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void showInfo() {
        System.out.println("Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                '}');
    }
}
