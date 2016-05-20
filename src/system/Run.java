package system;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial");
public class Run extends JPanel {
    
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        Graphics2D graphics2D = (Graphics2D) graphics;
    }
    
    public static void main(String[] args) throws InterruptedException {
        public JFrame frame = new JFrame("Nebula");
        public Run panel = new Run();
        frame.add(panel);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        while(true) {
            panel.repaint();
            Thread.sleep(10);
        }
    }
    
}
