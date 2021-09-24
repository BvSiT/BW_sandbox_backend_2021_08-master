public class Player {
    //velden/attributen
    private String token;
    private int rowPosition;//Rows start with 1

    //constructor
    public Player(String token) {
        this.token = token;
        this.rowPosition = 0;
    }

    //getters and setters
    public int getRowPosition() {
        return rowPosition;
    }
    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    //methoden
    public void move(){
        rowPosition++;
    }

}
