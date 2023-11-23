import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    //Atributes


    //Cunstructer
    public Window(){
        windowSettings();
        addStuff();
        finishWindow();
    }

    //Methods

    private void addStuff() {
        Color col = new Color (100,100,0);

        Square Sq = new Square(0,0,100,50, col);
        Square Sq2 = new Square(0,0,10,10, Color.red);

        JTextField text = new JTextField();

        this.add(Sq);
        this.add(Sq2);
    }

    private void windowSettings() {
        this.setBounds(300,200,600,400);
    }
    private void finishWindow() {
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setResizable(false);
            this.setVisible(true);
        }

    //Setters and getters
}


