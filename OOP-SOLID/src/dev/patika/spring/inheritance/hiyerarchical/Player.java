package dev.patika.spring.inheritance.hiyerarchical;


import dev.patika.spring.inheritance.single.Human;

/**
 * Username = baranbuyuk
 * Date = 29.07.2021 22:42
 **/
public class Player extends Human {


    public Player(String name, int age) {
        super(name, age);
    }

    public String getTeam() {
        return "Real Madrid";
    }

    @Override
    public void showInfo() {
        System.out.println("Player{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                '}');
    }
}
