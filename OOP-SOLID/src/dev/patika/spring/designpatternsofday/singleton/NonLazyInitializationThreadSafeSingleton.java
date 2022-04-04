package dev.patika.spring.designpatternsofday.singleton;

public final class NonLazyInitializationThreadSafeSingleton {

    private static NonLazyInitializationThreadSafeSingleton INSTANCE =
            new NonLazyInitializationThreadSafeSingleton();

    private NonLazyInitializationThreadSafeSingleton() {
    }

    public static NonLazyInitializationThreadSafeSingleton getInstance() {
        return INSTANCE;
    }

}
