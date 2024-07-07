public class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();

        c.setTime("12:00");

        String currentTime = c.getTime();
        System.out.println("Time: " + currentTime);
    }
}
