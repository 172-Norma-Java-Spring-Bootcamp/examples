package dev.patika.spring.solid.dip.good;

import java.util.List;

public class Email implements Message {


    private String text;
    private String to;
    private List<String> cc;
    private byte[] attaches;

    public Email(String text, String to, List<String> cc, byte[] attaches) {
        this.text = text;
        this.to = to;
        this.cc = cc;
        this.attaches = attaches;
    }

    @Override
    public void sendMessage() {
        sendEmail();
    }

    private void sendEmail() {
        //Send email
    }
}