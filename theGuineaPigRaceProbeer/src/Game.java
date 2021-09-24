import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    //velden
    private List<Player>  players;

    //constructor



    //methoden


    public Game() {
        players = new ArrayList<>();
    }
    //getters and setters
    //addPlayer(token)

    List<Integer> getPlayerInput()
    {
        int numOfPlayers=3;
        Scanner scanner = new Scanner(System.in);
        List<Integer> chosenNumbers = new ArrayList<>();

        for (int i = 0; i < numOfPlayers; i++) {
            System.out.print("Player "+ (i + 1) + ":" + " please choose number ");
            chosenNumbers.add(scanner.nextInt());
        }
        for (int i = 0; i < numOfPlayers; i++) {
            System.out.println("Player "+ (i + 1) + ":" + " has chosen number " + chosenNumbers.get(i));
        }
        return chosenNumbers;
    }
}
