import java.awt.*;
import java.util.*;

public abstract class Actor {
    Color colour;
    Cell loc;

    Random randomX = new Random();
    Random randomY = new Random();
    Random randomSize = new Random();

    int x_axis = randomX.nextInt(1225);
    int y_axis = randomY.nextInt(685);
    int size = randomSize.nextInt(50);

    public void paint(Graphics g){
        g.setColor(colour);
        g.fillRect(loc.x + x_axis, loc.y + y_axis, loc.width + size, loc.height + size);
    }

    public void paintGrass(Graphics g) {
        g.setColor(colour);
        g.fillRect(loc.x + x_axis, loc.y + y_axis, loc.width + size, loc.height + size);
    }

    public void paintGrass2(Graphics g) {
        g.setColor(colour);
        g.fillRect(loc.x + x_axis, loc.y + y_axis, loc.width + size, loc.height + size);
    }

    public void paintGrass3(Graphics g) {
        g.setColor(colour);
        g.fillRect(loc.x + x_axis, loc.y + y_axis, loc.width + size, loc.height + size);
    }

    public void paintRoad(Graphics g) {
        g.setColor(colour);
        g.fillRect(loc.x + x_axis, loc.y + y_axis, loc.width + size, loc.height + size);
    }

    public void paintMountain(Graphics g) {
        g.setColor(colour);
        g.fillRect(loc.x + x_axis, loc.y + y_axis, loc.width + size, loc.height + size);
    }

    public void paintWater(Graphics g) {
        g.setColor(colour);
        g.fillRect(loc.x + x_axis, loc.y + y_axis, loc.width + size, loc.height + size);
    }
}