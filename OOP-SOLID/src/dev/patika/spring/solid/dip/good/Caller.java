package dev.patika.spring.solid.dip.good;

import java.util.Arrays;
import java.util.Collections;

public class Caller {

    public static void main(String[] args) {
        Message sms = new SMS("Merhaba", 534444);
        Message sms2 = new SMS("Merhaba", 534444);
        Message sms3 = new SMS("Merhaba", 534444);
        Message sms4 = new SMS("Merhaba", 534444);
        Message email = new Email("message", "baran@gmail.com", Collections.emptyList(), new byte[]{});
        Message email2 = new Email("message", "baran@gmail.com", Collections.emptyList(), new byte[]{});
        Message email3 = new Email("message", "baran@gmail.com", Collections.emptyList(), new byte[]{});
        Message letter = new Letter();

        Notification notification = new Notification(Arrays.asList(sms, sms2, sms3, sms4, email, email2, email3,letter));
        notification.send();
    }
}
