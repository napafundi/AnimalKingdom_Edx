import java.awt.*;
import java.util.Random;

public class NinjaCat extends Critter {

    public NinjaCat() {}

    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else if (info.getFront() == Neighbor.WALL) {
            return Action.RIGHT;
        } else {
            return Action.LEFT;
        }
    }

    @Override
    public Color getColor() {
        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        Color randColor = new Color(r, g, b);
        return randColor;
    }

    @Override
    public String toString() {
        return "*";
    }

}
