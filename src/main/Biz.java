package main;

public class Biz extends Piece {

    public Biz(int color, int col, int row) {
        super(color, col, row);

        if (color == GamePanel.BLUE) {
            image = getImage("C/Users/ammar/Desktop/Kwazam/res/piece/BBIZ.png");
        } else {
            image = getImage("C/Users/ammar/Desktop/Kwazam/res/piece/RBIZ.png");
        }
    }
}
