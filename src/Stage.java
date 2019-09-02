import java.awt.*;

public class Stage {
    Grid grid;
    Grass grass;
    Grass_2 grass2;
    Grass_3 grass3;
    Road road;
    Mountain mountain;
    Water water;

    public Stage(){
        grid = new Grid();
        grass = new Grass();
        grass2 = new Grass_2();
        grass3 = new Grass_3();
        road = new Road();
        mountain = new Mountain();
        water = new Water();
    }

    public void paint(Graphics g, Point mouseLoc){
        grid.paint(g,mouseLoc);
        grass.paintGrass(g);
        grass2.paintGrass2(g);
        grass3.paintGrass3(g);
        road.paintRoad(g);
        mountain.paintMountain(g);
        water.paintWater(g);
    }


}