package dev.patika.spring.solid.dip.bad;

import java.util.Arrays;

public class Caller {

    public static void main(String[] args) {

        SMS sms = new SMS();
        SMS sms2 = new SMS();
        SMS sms3 = new SMS();
        SMS sms4 = new SMS();
        Email email = new Email();
        Email email2 = new Email();
        Letter letter = new Letter();

        Notification notification = new Notification(Arrays.asList(email, email2),
                Arrays.asList(sms, sms2, sms3, sms4), Arrays.asList(letter));
        notification.notifyUser();
    }

}
