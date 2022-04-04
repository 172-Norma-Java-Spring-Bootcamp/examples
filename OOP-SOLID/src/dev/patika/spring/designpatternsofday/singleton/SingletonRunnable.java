package dev.patika.spring.designpatternsofday.singleton;

public class SingletonRunnable implements Runnable{
    @Override
    public void run() {

        LazyInitializationNonThreadSafeSingleton instance = LazyInitializationNonThreadSafeSingleton.getInstance();

    }
}
