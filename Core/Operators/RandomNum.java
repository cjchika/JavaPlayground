import java.util.Random;

public class RandomNum {

    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(6)+1;
        double b = random.nextDouble(10);
        boolean c = random.nextBoolean();

        System.out.println(c);
    }
}
