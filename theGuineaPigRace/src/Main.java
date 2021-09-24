import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the guinea pig race");

        //Step 1 the game board
        String[] board = new String[15];

        for (int i = 0; i < 15; i++){
            board[i] = Integer.toString(i);
        }
        Player player1 = new Player("@");
        Player player2 = new Player("@");
        Player player3 = new Player("@");

        board[0] = player1.getToken();
        board[1] = player2.getToken();
        board[2] = player3.getToken();

        //show board
        printBoard(board);

        //Step 2 generate random number
        generateNumber guesNumber = new generateNumber();
        System.out.println();
        System.out.println("Give in a number 1, 2 or 3 and guess the random number: " + guesNumber.getRandomNumber());

        Scanner userInput = new Scanner(System.in);

        int player1Input = userInput.nextInt();
        int player2Input = userInput.nextInt();
        int player3Input = userInput.nextInt();

        System.out.println("Player 1 has chosen: " + player1Input);
        System.out.println("Player 2 has chosen: " + player2Input);
        System.out.println("Player 3 has chosen: " + player3Input);

        if (player1Input == guesNumber.getRandomNumber()){
            board[3] = player1.getToken();
            board[0] = "0";
        }else if (player2Input == guesNumber.getRandomNumber()){
            board[4] = player2.getToken();
            board[1] = "1";
        }else {
            board[5] = player3.getToken();
            board[2] = "2";
        }

        //show board
        printBoard(board);
    }

    public static void printBoard(String[] board){
        //show board
        for (int i = 0; i< board.length; i++){

            boolean sideEndTrack = (i + 1) % 3 == 0;
            boolean isField2 = i == 2;
            boolean isField11 = i == 11;
            boolean isField14 = i == 14;

            if ( i < 10){
                System.out.print(board[i] + "  | ");
            }else{
                System.out.print(board[i] + " | ");
            }

            if (sideEndTrack){
                System.out.println();
            }
            if (sideEndTrack && isField2){
                System.out.print("-------------------Start");
                System.out.println();
            }
            if (sideEndTrack && isField11){
                System.out.print("-------------------Finish");
                System.out.println();
            }
        }
    }

}

