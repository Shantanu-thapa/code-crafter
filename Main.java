package game;
import javax.swing.JFrame;

public class Main extends JFrame{
    Main(){
        add(new Board());
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(300,300);

    }
    public static void main(String[] args){

        new Main();



    }
}

