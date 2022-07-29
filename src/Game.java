import javax.swing.*;
import java.awt.*;

public class Game extends JPanel {

    int x, y;
    public void initialize() throws InterruptedException {
        JFrame frame = new JFrame("Jogo do Jeffin");
        frame.add(this);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        x = 0;
        y = 0;
        for(;;){
            x++;
            y++;
            this.repaint();
            Thread.sleep(100);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.BLUE);
        g2d.fillRect( this.x, this.y, 100, 10);
    }
}
