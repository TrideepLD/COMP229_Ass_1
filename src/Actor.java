import java.awt.*;

public abstract class Actor {
    Color colour;
    Cell loc;
    Color myLightGreen = new Color(0, 204, 0);
    // public static final Color newColour (int r, int g, int b) {
    //     return newColour(255, 0, 0);
    // }
    Color newColour;

    public void paint(Graphics g){
        g.setColor(colour);
        g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
        g.setColor(Color.GRAY);
        g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    }

    public void paintGrass(Graphics g) {
        g.setColor(colour);
        g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
        g.setColor(colour);
        g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    }

    public void paintGrass2(Graphics g) {
        g.setColor(colour);
        g.fillRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
        g.setColor(colour);
        g.drawRect(loc.x + 5, loc.y + 5, loc.width - 10, loc.height - 10);
    }
}