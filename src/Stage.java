import java.awt.*;

public class Stage {
    Grid grid;
    Actor puppy;
    Actor lion;
    Actor rabbit;
    Actor brightGrass;
    Grass grass;
    Grass_2 grass2;

    public Stage(){
        grid = new Grid();
        puppy = new Puppy(grid.cellAtColRow(0, 0));
        lion = new Lion(grid.cellAtColRow(0, 18));
        rabbit = new Rabbit(grid.cellAtColRow(14,3));
        brightGrass = new BrightGrass(grid.cellAtColRow(5, 10));
        grass = new Grass();
        grass2 = new Grass_2();
    }

    public void paint(Graphics g, Point mouseLoc){
        grid.paint(g,mouseLoc);
        puppy.paint(g);
        lion.paint(g);
        rabbit.paint(g);
        // brightGrass.paintGrass(g);
        grass.paintGrass(g);
        grass2.paintGrass2(g);
    }


}