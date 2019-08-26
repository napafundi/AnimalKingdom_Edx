import java.awt.*;

public class Bear extends Critter {
    private int moves = 1;

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
        return Color.WHITE;
    }

    @Override
    public String toString() {
        if (moves % 2 == 0) {
            return "/";
        } else {
            return "\\";
        }
    }
}
