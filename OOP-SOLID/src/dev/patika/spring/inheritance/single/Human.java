package dev.patika.spring.inheritance.single;

/**
 * Username = baranbuyuk
 * Date = 29.07.2021 22:05
 **/
public class Human {

    private final String name;
    private final int age;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println("Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}');
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
