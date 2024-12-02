class Calculator {
    public int add(int num1, int num2){
        return num1 + num2;
    }
}

class Computer{
    public void playMusic(){
        System.out.println("Playing...");
    }

    public String getBrand(){
        return "Mac";
    }
}

public class Demo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int res = calc.add(5,10);

//        System.out.println(res);

        Computer comp = new Computer();
        String brand = comp.getBrand();

//        System.out.println(brand);

        int nums[] = new int[3];
        nums[0] = 50;
        nums[1] = 100;
        nums[2] = 150;

//        for(int i = 0; i < nums.length; i++){
//            System.out.println(nums[i]);
//        }

        int numsArr[][] = new int[3][5];

        for(int i=0;i < 3; i++){
            for(int j =0; j < 5; j++){
               numsArr[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int i=0;i < 3; i++){
            for(int j =0; j < 5; j++){
                System.out.print(numsArr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enhanced...");

        for(int[] n : numsArr){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

}
