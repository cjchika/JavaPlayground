public class DrumkitTestDrive {
    public static void main(String[] args) {
        Drumkit d = new Drumkit();
        d.snare = false;

        d.playSnare();
        d.playTopHat();

        if(d.snare){
            d.playSnare();
        }

    }
}
