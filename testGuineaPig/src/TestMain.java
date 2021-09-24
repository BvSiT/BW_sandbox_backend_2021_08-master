import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMain {
    public static void main(String[] args) {

        Board board = new Board();
        //board.printBoard();

        Map<Integer,String> rowMap=new HashMap<Integer,String>();
        rowMap.put(0,"@");
        rowMap.put(2,"@");

        board.printRow(rowMap);



/*
        Player player = new Player("#");
        player.move();

        System.out.println("Player is now on row " + player.getRowPosition());

        Game  game = new Game();
        List<Integer> chosenNumbers = game.getPlayerInput();
        System.out.println(chosenNumbers);
*/

    }
}
