public class TapeDeskTestDrive {
    public static void main(String[] args) {

        TapeDesk tapeDesk = new TapeDesk();

        tapeDesk.canRecord = true;
        tapeDesk.playTape();

        if(tapeDesk.canRecord){
            tapeDesk.recordTape();
        }
    }
}
