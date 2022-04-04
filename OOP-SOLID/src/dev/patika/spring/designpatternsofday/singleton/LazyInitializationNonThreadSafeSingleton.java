package dev.patika.spring.designpatternsofday.singleton;

public final class LazyInitializationNonThreadSafeSingleton {

    private static LazyInitializationNonThreadSafeSingleton instance = null;

    private LazyInitializationNonThreadSafeSingleton() {
    }

    public static LazyInitializationNonThreadSafeSingleton getInstance() {
        synchronized (LazyInitializationNonThreadSafeSingleton.class) {
            if (instance == null) { // 0,03 ms
                System.out.println("Im first caller");
                instance = new LazyInitializationNonThreadSafeSingleton();
            }
        }
        return instance;
    }


}
