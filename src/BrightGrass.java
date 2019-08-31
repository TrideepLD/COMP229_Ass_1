import java.awt.*;

public class BrightGrass extends Actor {

    Color myColor = new Color(0, 0, 200);

    public BrightGrass(Cell loc) {
        this.loc = loc;
        this.newColour = Color.GREEN;
    }

}