public class SonOfBoo extends Boo{

    public static void main(String[] args) {
        SonOfBoo sb = new SonOfBoo();
    }

    public SonOfBoo(String s){
        super(50);
    }

    public SonOfBoo(){
        super("Boo");
    }

    public SonOfBoo(int i){
        super("Fred");
    }

    public SonOfBoo(int i, String s){
        super("Fred");
    }
}
