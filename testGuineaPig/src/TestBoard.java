public class TestBoard {

    public static void main(String[] args) {
        String baseField = " |";
        System.out.println(updateField("@",baseField));
        String board[] = new String[9];
        int numCol=3;
        int row = 2;
        int col = 2;
        board[(row)* numCol + col]="x";
        System.out.println(board[8]);
    }
    static String updateField(String replaceString, String baseField){
        return replaceString+ baseField.substring(replaceString.length());
    }
}


