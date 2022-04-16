package dev.patika.spring;

public class RealPresident implements President {

    private boolean isOnTrip = false;

    @Override
    public String readAndAnswerEnvelope(String message) {
        System.out.println("Message which send from citizen read by Real President");
        return "We'll do that";
    }

    @Override
    public void signNewLaws() {
        System.out.println("Signed by Real President");
    }

    @Override
    public void assign() {
        System.out.println("Assigned by Real President");
    }

    public boolean isOnTrip() {
        return isOnTrip;
    }
}
