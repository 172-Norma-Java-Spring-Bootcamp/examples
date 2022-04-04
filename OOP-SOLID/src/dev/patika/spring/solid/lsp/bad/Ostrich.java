package dev.patika.spring.solid.lsp.bad;

public class Ostrich implements Bird {
    @Override
    public void fly() {
        // no-op
    }

    //Normally Ostrich can't fly, but we are saying that can fly. This is an exception.
    //According to LSP, there should not be an exception in child class implementation.
}
