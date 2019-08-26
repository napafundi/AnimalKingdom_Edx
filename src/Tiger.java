import java.awt.*;
import java.util.Random;

public class Tiger extends Critter {
    private int colorCount = 0;
    private int randomNum;
    private Color color;
    private static Color[] tigerColors = {Color.RED, Color.GREEN, Color.BLUE};
    private static Random generator = new Random();

    public Tiger() {}

    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
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
        return "TGR";
    }

    @Override
    public Color getColor() {
        switch (colorCount) {
            case 0:
                randomNum = generator.nextInt(tigerColors.length);
                setColor(tigerColors[randomNum]);
                break;
            case 3:
                randomNum = generator.nextInt(tigerColors.length);
                setColor(tigerColors[randomNum]);
                this.colorCount = 0;
                break;
        }
        this.colorCount += 1;
        return this.color;
    }

    private void setColor(Color newColor) {
        this.color = newColor;
    }

}
