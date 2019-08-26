import java.awt.*;

public class Giant extends Critter {
    private static final Color COLOR = Color.GRAY;
    private int numMoves = 1;
    private String giantTalk = "fee";

    public Giant() {}

    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }

    @Override
    public Color getColor() {
        return COLOR;
    }

    @Override
    public String toString() {
        if (numMoves % 6 == 0) { // change Giant's string representation every 6 moves
            setGiantTalk();
        }
        return giantTalk;
    }

    public void setGiantTalk() {
        if (giantTalk == "fee") {
            giantTalk = "fie";
        } else if (giantTalk == "fie") {
            giantTalk = "fum";
        } else {
            giantTalk = "fee";
        }
        numMoves += 1;
    }
}
