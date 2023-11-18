import java.util.function.BiPredicate;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }



}
