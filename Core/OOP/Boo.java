public class Boo {
    public Boo(int i){
        System.out.println("From int param" + i);
    }
    public Boo(String s){
        System.out.println("From String param" + s);
    }

    public Boo(String s, int i){
        System.out.println("From int and String param" + s + i);
    }
}
