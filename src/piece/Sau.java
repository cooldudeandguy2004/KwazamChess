package piece;

import main.GamePanel;

public class Sau extends Piece {

    public Sau(int color, int col, int row) {
        super(color, col, row);

        if (color == GamePanel.BLUE) {
            image = getImage("C/Users/ammar/Desktop/Kwazam/res/piece/BSAU.png");
        } else {
            image = getImage("C/Users/ammar/Desktop/Kwazam/res/piece/RSAU.png");
        }
    }
}
