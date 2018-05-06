package chapter02;

public class TapeDeskTestDrive {
    public static void main(String[] args) {
        TapeDesk t = new TapeDesk();

        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}
