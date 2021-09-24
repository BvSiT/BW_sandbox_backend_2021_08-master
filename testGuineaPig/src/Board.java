import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Board {
    //attributen/Velden
    private boolean[][] isOccupied; //is field occupied by a player
    int numRows;
    int numColums;
    String baseField;

    //Constructor
    public Board(int numRows, int numColums, String baseField) {
        this.numRows = numRows;
        this.numColums = numColums;
        this.baseField = baseField;
        isOccupied = new boolean[numRows][numColums];
    }

    public Board() {
        this(3,3,"  |");
    }

    //Methode
    public void printStart(){
        printSeparatorLine("Start");
    }
    public void printFinish() {
        printSeparatorLine("Finish");
    }
    public void printSeparatorLine(String lineEnd){
        String linePiece = "-".repeat(baseField.length());
        System.out.println(linePiece.repeat(numColums) + lineEnd);

    }

    public void printRow(){
        System.out.println(baseField.repeat(numColums));
    }

    /*
    *
    * Map map=new HashMap();
    //Adding elements to map
    map.put(1,"Amit");
    map.put(5,"Rahul");
    map.put(2,"Jai");
    map.put(6,"Amit");
    map.put(0,"@");

    *  */

    public void printRow(Map<Integer,String> rowData){
        //System.out.println(baseField.repeat(numColums));
        String row="";
        for (int i = 0; i < numColums; i++) {
            if (rowData.containsKey(i)){
                row+=updateField("@", baseField);
            }
            else {
                row+=baseField;
            }
        }
        System.out.println(row);
    }

    String updateField(String replaceString, String baseField){
        return replaceString+ baseField.substring(replaceString.length());
    }


    void printBoard(){
        printStart();
        for (int i = 0; i < numRows ; i++) {
            printRow();
        }
        printFinish();
    }

    //TODO create private method setField(int row, int col, boolean value)
    //TODO create method resetIsOccupied which sets all elements to false
    //TODO Create overload printBoard passing isOccupied to show board with fields occupied

}
