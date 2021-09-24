public class Board {
    //attributen/velden
    int numCol;
    int row;
    int col;

    //constructor
    public Board(int numCol, int row, int col) {
        this.numCol = 3;
        this.row = row;
        this.col = col;
    }

    //getters and setters
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

    //methoden
    public static void printBoard(int numOfColums){



    }
}
