import java.awt.*;

class Grass {
    //fields
    Cell[][] cells = new Cell[36][10];

    // constructor
    public Grass(){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j] = new Cell(10+35*i,360+35*j);
            }
        }
    }
    

    // methods
    public void paintGrass(Graphics g){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j].paintGrass(g);
            }
        }
    }

    public Cell cellAtColRow(int c, int r){
        return cells[c][r];
    }
}