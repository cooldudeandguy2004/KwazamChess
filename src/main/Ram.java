package main;

public class Ram extends Piece {

    public Ram(int color, int col, int row) {
        super(color, col, row);

        if (color == GamePanel.BLUE) {
            image = getImage("C/Users/ammar/Desktop/Kwazam/res/piece/BRAM.png");
        } else {
            image = getImage("C/Users/ammar/Desktop/Kwazam/res/piece/rRAM.png");
        }
    }
}
