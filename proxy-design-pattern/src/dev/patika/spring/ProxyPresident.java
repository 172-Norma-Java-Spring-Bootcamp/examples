package dev.patika.spring;

public class ProxyPresident implements President {


    private final RealPresident realPresident;

    public ProxyPresident() {
        realPresident = new RealPresident();
    }

    @Override
    public String readAndAnswerEnvelope(String message) {
        if (message.contains("confidential")) { // Buradaki condition'a gore..
            return realPresident.readAndAnswerEnvelope(message);
        }
        return "We'll do that";
    }

    @Override
    public void signNewLaws() {
        // conditions
        if (realPresident.isOnTrip()) {
            System.out.println("Laws signed by Proxy President");
        } else {
            realPresident.signNewLaws();
        }

    }

    @Override
    public void assign() {
        //conditions..

    }
}
