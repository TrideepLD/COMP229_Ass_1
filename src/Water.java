import java.awt.*;
import java.util.*;

class Water {
    //fields

    Random randomX = new Random();
    Random randomY = new Random();
    Random randomSize = new Random();

    int x_axis = randomX.nextInt(35);
    int y_axis = randomY.nextInt(35);
    int size = randomSize.nextInt(35);
    
    Cell[][] cells = new Cell[x_axis][y_axis];

    // constructor
    public Water(){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j] = new Cell(10+size*i,10+size*j);
            }
        }
    }
    

    // methods
    public void paintWater(Graphics g){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j].paintWater(g);
            }
        }
    }

    public Cell cellAtColRow(int c, int r){
        return cells[c][r];
    }
}