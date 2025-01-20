package main;

public class Xor extends Piece {

    public Xor(int color, int col, int row) {
        super(color, col, row);

        if (color == GamePanel.BLUE) {
            image = getImage("C/Users/ammar/Desktop/Kwazam/res/piece/BXOR.png");
        } else {
            image = getImage("C/Users/ammar/Desktop/Kwazam/res/piece/RXOR.png");
        }
    }
}
