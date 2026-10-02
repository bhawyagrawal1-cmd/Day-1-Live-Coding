import javax.swing.*;
import java.awt.*;
public class sample2 {
    public static void main(String[] args) {
        JFrame f = new JFrame("New Window");
        JButton b = new JButton("Submit");
        b.addActionListener(e->{
            JOptionPane.showMessageDialog(null, "Button Clicked");
        });
        f.setVisible(true);
        f.add(b);
    }
}
