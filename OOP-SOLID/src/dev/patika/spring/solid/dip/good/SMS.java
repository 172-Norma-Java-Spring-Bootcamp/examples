package dev.patika.spring.solid.dip.good;

public class SMS implements Message {


    private String text;
    private Integer phoneNumber;

    public SMS(String text, Integer phoneNumber) {
        this.text = text;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendMessage() {
        sendSMS();
    }

    private void sendSMS() {
        //Send sms
    }
}