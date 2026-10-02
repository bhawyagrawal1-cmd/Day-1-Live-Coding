import javax.swing.*;

public class sample1 {
    public static void main(String[] args) {

        JFrame f = new JFrame("Food Choice");
        JLabel title = new JLabel("Food Choice");
        String[] foods = {"Pizza", "Burger", "Biryani", "Pasta", "Fried Rice"};
        JComboBox<String> foodChoice = new JComboBox<>(foods);
        JLabel spiceLabel = new JLabel("Choose Spiceness:");
        JRadioButton mild = new JRadioButton("Mild");
        JRadioButton medium = new JRadioButton("Medium");
        JRadioButton spicy = new JRadioButton("Spicy");
        ButtonGroup spiceGroup = new ButtonGroup();
        spiceGroup.add(mild);
        spiceGroup.add(medium);
        spiceGroup.add(spicy);
        JLabel feedbackLabel = new JLabel("Customer Feedback:");
        JTextArea feedback = new JTextArea("Enter your feedback here...", 5, 25);
        JButton submit = new JButton("Submit");

        f.setSize(500, 400);
        f.setLayout(new java.awt.FlowLayout());
        f.add(title);
        f.add(new JLabel("Select Food:"));
        f.add(foodChoice);
        f.add(spiceLabel);
        f.add(mild);
        f.add(medium);
        f.add(spicy);
        f.add(feedbackLabel);
        f.add(feedback);
        f.add(submit);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}