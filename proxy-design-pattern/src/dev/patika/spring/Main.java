package dev.patika.spring;

public class Main {

    public static void main(String[] args) {
        // write your code here

        President president = new ProxyPresident();
        String message1 = president.readAndAnswerEnvelope("Please help us");
        String message2 = president.readAndAnswerEnvelope("This is confidential envelope, please help us!");
        president.signNewLaws();

        System.out.println("Message 1 = " + message1);
        System.out.println("Message 2 = " + message2);
    }
}
