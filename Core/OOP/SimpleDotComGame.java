import java.util.Scanner;

public class SimpleDotComGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfGuesses = 0;

        SimpleDotCom theGame = new SimpleDotCom();

        int randomNum = (int) (Math.random() *  5);

        int[] locations = {randomNum,randomNum+1,randomNum+2};

        theGame.setLocationCells(locations);

        boolean isAlive = true;

        while(isAlive){
            System.out.println("Enter a number... ");
            String  guess = scanner.nextLine();

            String result = theGame.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses!");
            }

        }


    }
}
