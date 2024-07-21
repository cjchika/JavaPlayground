public class TestFormats {
    public static void main(String[] args) {
        String s = String.format("%, d",2000000000);
//        System.out.println(s);

        int one = 20456654;
        double two = 100567890.248907;

        String s2 = String.format("The rank is %,d out of %,.2f %c", one, two, 42);
//        System.out.println(s2);

        
    }
}
