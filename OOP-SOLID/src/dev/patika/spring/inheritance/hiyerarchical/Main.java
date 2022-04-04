package dev.patika.spring.inheritance.hiyerarchical;



/**
 * Username = baranbuyuk
 * Date = 29.07.2021 22:43
 **/

import dev.patika.spring.inheritance.single.Human;
import dev.patika.spring.inheritance.single.Student;

/**
 * Below topics should be mention in the presentation
 * 1- How can i add new behavior specific class?
 * 2- How can I access to fields of parent classes?
 */
public class Main {

    public static void main(String[] args) {

        Human player = new Player("Player", 25);
        player.showInfo();

        // There is a method in the player class which name is getTeam() but doesnt appear for now, how can i access it?
        //player.getTeam();

        Human teacher = new Teacher("Teacher", 45);
        teacher.showInfo();

        Human student = new Student("Student", 50);
        student.showInfo();

        //as you see, we have three different classes which are Teacher, Person, Student and all of them extended from Human class
        // Actually, all of them is a Human and they have showInfo() behavior from Human class.
        // That's Inheritance.


        // any question?
    }
}
