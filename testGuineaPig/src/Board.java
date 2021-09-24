public class Board {
    //attributen/Velden
    String board[] = new String[15];
    int numRows;
    int numColums;

    //Constructor

    public Board(int numRows, int numColums) {
        this.numRows = numRows;
        this.numColums = numColums;
    }

    public Board() {
        this(5, 3);
    }


    //Methode
    public void printStart(){
        printSeparatorLine("Start");
    }
    public void printFinish() {
        printSeparatorLine("Finish");
    }
    public void printSeparatorLine(String lineEnd){
        String linePiece = "--";
        System.out.println(linePiece.repeat(numColums) + lineEnd);

    }
}
