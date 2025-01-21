package main;

public class Sau extends Piece {

    public Sau(int color, int col, int row) {
        super(color, col, row);

        if (color == GamePanel.BLUE) {
            image = getImage("Kwazam\\KwazamChess-main\\res\\Piece\\BSAU.png");
        } else {
            image = getImage("Kwazam\\KwazamChess-main\\res\\Piece\\RSAU.png");
        }
    }
}
