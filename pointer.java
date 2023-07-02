import javax.swing.*;
import java.awt.*;

public class pointer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("KETERANGAN LABEL");
        frame.setBounds(500, 500, 500, 300);
        JLabel label1 = new JLabel("ITESA");
        label1.setBounds(50, 10, 200, 50);
        label1.setToolTipText("Mouse Printer berada pada label 1");
        frame.add(label1);
        JLabel label2 = new JLabel();
        label2.setBounds(170, 170, 200, 50);
        label2.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Lenovo\\IdeaProjects\\mouse\\src\\b.png").getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
        label2.setToolTipText("Mouse Printer berada pada gambar masjid");
        frame.add(label2);
        JLabel label3 = new JLabel("itesa");
        label3.setBounds(200, 210, 200, 50);
        label3.setToolTipText("Mouse Printer berada pada label 3");
        frame.add(label3);
        JLabel label = new JLabel("itesa");
        label.setBounds(100, 50, 200, 50);
        label.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Lenovo\\IdeaProjects\\pointer\\src\\c.png").getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT))); //Sets the image to be displayed as an icon
        label.setToolTipText("Mouse Printer berada pada label 2");
        frame.add(label);

        frame.setVisible(true);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
