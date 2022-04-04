package dev.patika.spring.solid.lsp.bad;

public class Duck implements Bird {
    @Override
    public void fly() {
        System.out.println("I can fly..");
    }
}
