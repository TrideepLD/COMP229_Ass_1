import java.awt.*;
import javax.swing.*;

class Cell extends Rectangle {
    // fields
    static int size = 35;

    //constructors
    public Cell(int x, int y){
        super(x,y,size,size);
    }

    
    //methods
    void paint(Graphics g, Point mousePos){
        if(contains(mousePos)){
            g.setColor(Color.GRAY);
        } else {
            g.setColor(Color.WHITE);
        }
        g.fillRect(x,y,size,size);
        g.setColor(Color.BLACK);
        g.drawRect(x,y,size,size);
    }

    void paintGrass(Graphics g){
        g.setColor(Color.getHSBColor(0.35f,0.52f,0.36f));
        g.fillRect(x,y,size,size);
        g.setColor(Color.getHSBColor(0.3f, 0.5f, 0.3f));
        g.drawRect(x,y,size,size);
    }

    void paintGrass2(Graphics g){
        g.setColor(Color.getHSBColor(0.382494f,1.0f,0.54509807f));
        g.fillRect(x,y,size,size);
        g.setColor(Color.getHSBColor(0.3572744f,1.0f,0.70980394f));
        g.drawRect(x,y,size,size);
    }

    public boolean contains(Point p){
        if (p != null){
            return super.contains(p);
        } else {
            return false;
        }
    }
}