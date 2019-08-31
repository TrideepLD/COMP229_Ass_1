import java.awt.*;

class Grass_2 {
    //fields
    Cell[][] cells = new Cell[36][5];

    // constructor
    public Grass_2(){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j] = new Cell(10+35*i,215+35*j);
            }
        }
    }
    

    // methods
    public void paintGrass2(Graphics g){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j].paintGrass2(g);
            }
        }
    }

    public Cell cellAtColRow(int c, int r){
        return cells[c][r];
    }
}