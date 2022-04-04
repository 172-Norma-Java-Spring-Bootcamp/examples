package dev.patika.spring.designpatternsofday.singleton;

public final class LazyInitializationThreadSafeSingleton {

    private LazyInitializationThreadSafeSingleton() {
    }


    public static LazyInitializationThreadSafeSingleton getInstance() {
        return Holder.INSTANCE;
    }

    private static class Holder {
        private static final LazyInitializationThreadSafeSingleton INSTANCE = new LazyInitializationThreadSafeSingleton();
    }

}
