import javax.swing.*;
public class sample {
    public static void main(String[] args) {
        JFrame f = new JFrame("My first Window");
        JLabel l = new JLabel("Swing Session");
        JButton b = new JButton("Click Me");
        JCheckBox c = new JCheckBox("Attended Session 1");
        JCheckBox c1 = new JCheckBox("Attended Session 2");
        JRadioButton r1 = new JRadioButton("Option 1");
        JRadioButton r2 = new JRadioButton("Option 2");
        JRadioButton r3 = new JRadioButton("Option 3");
        JTextArea t = new JTextArea(5, 20);
        ButtonGroup g = new ButtonGroup();
        String[] sessions = {"java", "python", "c++", "c", "javascript"};
        JComboBox<String> session = new JComboBox<>(sessions);
        f.setSize(2000, 2000);
        f.setLayout(new java.awt.FlowLayout());
        l.setHorizontalAlignment(JLabel.CENTER);
        f.add(t);
        f.add(session);
        g.add(r1);
        g.add(r2);
        g.add(r3);
        f.add(l);
        f.add(b);
        f.add(c);
        f.add(c1);
        f.add(r1);
        f.add(r2);
        f.add(r3);
        f.setVisible(true);
    }
}
