import java.util.List;

public class TestMain {
    public static void main(String[] args) {

        Board board = new Board(5, 3);

        board.printStart();
        board.printFinish();


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
