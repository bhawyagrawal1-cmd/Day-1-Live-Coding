import javax.swing.*;
import java.awt.*;

public class sample3 {
    public static void main(String[] args) {

        JFrame f = new JFrame("Price Calculator");

        JLabel l1 = new JLabel("Product Price:");
        JLabel l2 = new JLabel("Quantity:");

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField(10);

        JButton b = new JButton("Enter");
        b.addActionListener(e->{
            int Price=Integer.parseInt(t1.getText());
            int Quantity=Integer.parseInt(t2.getText());
            int calculate=Price*Quantity; 
        });
        f.add(l1);
        f.add(t1);
        f.setLayout(new GridLayout(3, 2, 10, 10));
        f.add(l2);
        f.add(t2);
        f.setSize(300,200);
        f.add(b);
        f.setVisible(true);


    }
}