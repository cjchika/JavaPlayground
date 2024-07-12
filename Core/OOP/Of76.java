public class Of76 extends Clowns{
    public static void main(String[] args) {
        Nose[] n = new Nose[3];

        n[0] = new Acts();
        n[1] = new Clowns();
        n[2] = new Of76();

        for(int x = 0;  x < 3; x++){
            System.out.println(n[x].iMethod() + " " + n[x].getClass());
        }
    }
}
