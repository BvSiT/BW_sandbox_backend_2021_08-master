public class Board {
    //attributen/Velden
    String board[] = new String[15];
    int numCol;
    int row;
    int col;

    //Constructor

    public Board(int numCol, int row, int col) {
        this.numCol = 3;
        this.row = row;
        this.col = col;
    }

    //getters and setters

    public String[] getBoard() {
        return board;
    }
    public void setBoard(String[] board) {
        this.board = board;
    }
    public int getNumCol() {
        return numCol;
    }
    public void setNumCol(int numCol) {
        this.numCol = numCol;
    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    public int getCol() {
        return col;
    }
    public void setCol(int col) {
        this.col = col;
    }

    //Methode
    public static void printBoard(int numOfColums){
        System.out.println(numOfColums);
    }
}
