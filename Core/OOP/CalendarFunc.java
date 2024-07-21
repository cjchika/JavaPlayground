import java.util.Calendar;

public class CalendarFunc {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2005,0,10,20,20);

        System.out.println(c.HOUR_OF_DAY);
        System.out.println(c.DAY_OF_MONTH);
    }
}
