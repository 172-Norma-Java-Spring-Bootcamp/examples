package dev.patika.spring.designpatternsofday.singleton;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        new Thread(new SingletonRunnable()).start();
        new Thread(new SingletonRunnable()).start();
        new Thread(new SingletonRunnable()).start();
        new Thread(new SingletonRunnable()).start();
        new Thread(new SingletonRunnable()).start();


    }
}
