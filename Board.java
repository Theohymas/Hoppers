import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
    
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();

    /**Board constructor to create a closable board and set a 5 x 5 grid layout, adding
     * 25 squares to the JPanel and setting the size as well as title of the board
     **/
    public Board()
    {
        GridLayout Grid = new GridLayout(5, 5);
        panel.setLayout(Grid);
        frame.add(panel);

        for( int x = 0; x < 5; x++)
        {
            for( int y = 0; y < 5; y++)
            {
                Square square = new Square(x, y);
                panel.add(square);
            }
        }

        frame.setContentPane(panel);
        frame.setTitle("Hoppers!");
        frame.setSize(650, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String args[])
    {
        Board Hopper = new Board();
    }
}