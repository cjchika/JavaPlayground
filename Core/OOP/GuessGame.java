public class GuessGame {
    Player player1;
    Player player2;
    Player player3;

    public void startGame(){
        player1 = new Player();
        player2 = new Player();
        player3 = new Player();

        int guessPlayer1 = 0;
        int guessPlayer2 = 0;
        int guessPlayer3 = 0;

        boolean player1IsRight = false;
        boolean player2IsRight = false;
        boolean player3IsRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while(true){
            System.out.println("Number to guess is " + targetNumber);

            player1.guess();
            player2.guess();
            player3.guess();

            guessPlayer1 = player1.number;
            System.out.println("Player one guessed " + guessPlayer1);

            guessPlayer2 = player2.number;
            System.out.println("Player two guessed " + guessPlayer2);

            guessPlayer3 = player3.number;
            System.out.println("Player three guessed " + guessPlayer3);

            if(guessPlayer1 == targetNumber){
                player1IsRight = true;
            }

            if(guessPlayer2 == targetNumber){
                player2IsRight = true;
            }

            if(guessPlayer3 == targetNumber){
                player3IsRight = true;
            }

            if(player1IsRight || player2IsRight || player3IsRight){
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + player1IsRight);
                System.out.println("Player two got it right? " + player2IsRight);
                System.out.println("Player three got it right? " + player3IsRight);
                System.out.println("Game is over!");
                break;
            } else{
                System.out.println("Players will have to try again.");
            }
        }
    }
}
