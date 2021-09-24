public class Field {
    //attributen/Velden

    //Constructor

    //getters and setters

    //Methode
    public static void printBoard(String[] String){
        String[] board = new String[15];

        for (int i = 0; i < 15; i++){
            board[i] = Integer.toString(i);
        }
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
