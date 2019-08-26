import java.awt.*;

public class WhiteTiger extends Critter{
    private static Color color = Color.WHITE;
    private boolean infectedOther = false;

    public WhiteTiger() {}

    // If this WhiteTiger hasn't infected another critter yet and is infecting now, set infectedOther to true.
    public void setInfected() {
        if (!infectedOther) {
            infectedOther = true;
        }
    }

    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            setInfected();
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }

    @Override
    public String toString() {
        if (infectedOther) {
            return "TGR";
        } else {
            return "tgr";
        }
    }

    @Override
    public Color getColor() {
        return color;
    }
}
