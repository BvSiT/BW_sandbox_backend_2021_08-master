import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the guinea pig race");

        //Step 1 the game board
        Player player1 = new Player("@");
        Player player2 = new Player("@");
        Player player3 = new Player("@");

        board[0] = player1.getToken();
        board[1] = player2.getToken();
        board[2] = player3.getToken();

        //show board
        printBoard(board);

        Game game = new Game();






        //Step 2 generate random number
        generateNumber guesNumber = new generateNumber();
        System.out.println();
        System.out.println("Give in a number 1, 2 or 3 and guess the random number: " + guesNumber.getRandomNumber());

        Scanner userInputRound1 = new Scanner(System.in);

        int player1InputRound1 = userInputRound1.nextInt();
        int player2InputRound1 = userInputRound1.nextInt();
        int player3InputRound1 = userInputRound1.nextInt();

        System.out.println("Player 1 has chosen: " + player1InputRound1);
        System.out.println("Player 2 has chosen: " + player2InputRound1);
        System.out.println("Player 3 has chosen: " + player3InputRound1);

        //round 1
        if (player1InputRound1 == guesNumber.getRandomNumber()){
            board[3] = player1.getToken();
            board[0] = "0";
        }else if (player2InputRound1 == guesNumber.getRandomNumber()){
            board[4] = player2.getToken();
            board[1] = "1";
        }else {
            board[5] = player3.getToken();
            board[2] = "2";
        }
        //show board
        printBoard(board);

        Scanner userInputRound2 = new Scanner(System.in);
        //round 2
        System.out.println("Give in a number 1, 2 or 3 and guess the random number: " + guesNumber.getRandomNumber());

        int player1InputRound2 = userInputRound2.nextInt();
        int player2InputRound2 = userInputRound2.nextInt();
        int player3InputRound2 = userInputRound2.nextInt();

        System.out.println("Player 1 has chosen: " + player1InputRound2);
        System.out.println("Player 2 has chosen: " + player2InputRound2);
        System.out.println("Player 3 has chosen: " + player3InputRound2);

            //player1 win round 1 and 2
            if (player1InputRound2 == guesNumber.getRandomNumber() && board[3] == player1.getToken()){
                board[6] = player1.getToken();
                board[3] = "3";
                //player 2 win round 2
            }else if (player2InputRound2 == guesNumber.getRandomNumber() && board[1] == player2.getToken()){
                board[4] = player2.getToken();
                board[1] = "1";
                //player 3 win round 2
            }else {
                board[5] = player3.getToken();
                board[2] = "2";
            }
            //player3 win round 1 and 2
            if (player3InputRound2 == guesNumber.getRandomNumber() && board[5] == player3.getToken()){
                board[8] = player3.getToken();
                board[5] = "5";
                //player 2 win round 2
            }else if (player2InputRound2 == guesNumber.getRandomNumber() && board[1] == player2.getToken()){
                board[4] = player2.getToken();
                board[1] = "1";
                //player 1 win round 2
            }else {
                board[3] = player1.getToken();
                board[0] = "0";
            }
            //show board
            printBoard(board);
    }


}

