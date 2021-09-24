import java.util.Random;

public class generateNumber {
    //velden - attributen
    private int randomNumber;
    private int maximum = 3;

    //constructor
    public generateNumber(){
        Random randomizer = new Random();
        randomNumber = randomizer.nextInt(maximum) + 1;
        this.randomNumber = randomNumber;
    }
    //getters and setters

    //Methode
    public int getRandomNumber(){
        return randomNumber;
    }
}
