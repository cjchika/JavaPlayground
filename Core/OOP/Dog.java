public class Dog {
    private  String name;
    private int size;

//    Dog(String name, int age){
//        this.name = name;
//        this.age = age;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void bark(int numOfBarks){

        while(numOfBarks > 0){
            if(size > 60){
                System.out.println("Whooof! Whooof!");
            } else if( size > 14){
                System.out.println("Ruff! Ruff!");
            } else{
                System.out.println("Yip! Yip!");
            }
            numOfBarks = numOfBarks - 1;
        }
    }



}
