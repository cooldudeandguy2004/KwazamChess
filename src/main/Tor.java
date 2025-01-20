package main;

public class Tor extends Piece {

    public Tor(int color, int col, int row) {
        super(color, col, row);

        if (color == GamePanel.BLUE) {
            image = getImage("C/Users/ammar/Desktop/Kwazam/res/piece/BTOR.png");
        } else {
            image = getImage("C/Users/ammar/Desktop/Kwazam/res/piece/RTOR.png");
        }
    }
}
