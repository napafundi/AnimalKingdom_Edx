import java.awt.*;

public class Bear extends Critter {
    private int moves = 1;
    private boolean polar;

    public Bear(boolean polar) {
        this.polar = polar;
    }

    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY){
            moves += 1;
            return Action.HOP;
        } else {
            moves += 1;
            return Action.LEFT;
        }
    }

    @Override
    public Color getColor() {
        if (polar) {
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }

    }

    // Alternate between / and \ for movement based on number of moves already made.
    @Override
    public String toString() {
        if (moves % 2 == 0) {
            return "/";
        } else {
            return "\\";
        }
    }
}
