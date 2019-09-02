import java.awt.*;

class Grass {
    //fields
    Cell[][] cells = new Cell[36][20];

    // constructor
    public Grass(){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                cells[i][j] = new Cell(10+35*i,10+35*j);
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

    public String Sout(String s) {
        s = "Legend\nx-axis value: 36\ny-axis value: 20\nSize of Squares: 35";
        System.out.println(s);
        return s;
    }
    public Cell cellAtColRow(int c, int r){
        return cells[c][r];
    }
}