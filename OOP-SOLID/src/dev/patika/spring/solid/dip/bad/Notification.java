package dev.patika.spring.solid.dip.bad;

import java.util.Arrays;
import java.util.List;

public class Notification {

    private final List<Email> emails;
    private final List<SMS> sms;
    private final List<Letter> letters;

    public Notification(List<Email> emails, List<SMS> sms, List<Letter> letters) {
        this.emails = emails;
        this.sms = sms;
        this.letters = letters;
    }

    public void notifyUser() {
        emails.forEach(Email::sendMail);
        sms.forEach(SMS::sendSMS);
        letters.forEach(Letter::sendLetter);
    }


}