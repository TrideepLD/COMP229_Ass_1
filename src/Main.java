import javax.swing.*;
import java.awt.*;

class Main extends JFrame {
    
    class App extends JPanel {
        
        Stage stage;
        Grass grass;
        Grass_2 grass2;

        public App() {
            setPreferredSize(new Dimension(1280, 720));
            stage = new Stage();
            grass = new Grass();
            grass2 = new Grass_2();
        }

        @Override
        public void paint(Graphics g) {
            stage.paint(g, getMousePosition());
        }

        public void paintGrass(Graphics g) {
            grass.paintGrass(g);
        }

        public void paintGrass2(Graphics g) {
            grass2.paintGrass2(g);
        }
    }

    public static void main(String[] args) throws Exception {
        Main window = new Main();
        window.run();
    }

    private Main() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        App canvas = new App();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }

    public void run() {
        while (true) {
            this.repaint();
        }
    }
}