import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StringSearchGUI extends JFrame implements ActionListener {
    private JTextField inputField1, inputField2;
    private JLabel resultLabel;

    public StringSearchGUI() {
        super("String Search");
        setLayout(new GridLayout(3, 2));

        add(new JLabel("Word:"));
        inputField1 = new JTextField(20);
        add(inputField1);

        add(new JLabel("Combination:"));
        inputField2 = new JTextField(20);
        add(inputField2);

        JButton checkButton = new JButton("Check");
        checkButton.addActionListener(this);
        add(checkButton);

        resultLabel = new JLabel();
        add(resultLabel);

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String word = inputField1.getText();
        String combination = inputField2.getText();
        if (isSubstring(word, combination)) {
            resultLabel.setText("yes");
        } else {
            resultLabel.setText("no");
        }

    }
    public boolean isSubstring(String word, String combination) {
        int index = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            index = combination.indexOf(c, index);
            if (index == -1) {
                return false;
            }
            index++;
        }
        return true;
    }
    public static void main(String[] args) {
        new StringSearchGUI();
    }
}