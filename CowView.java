import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CowView extends JFrame {
    private JTextField cowIdField = new JTextField(10);
    private JButton submitButton = new JButton("Submit");
    private JLabel resultLabel = new JLabel();

    public CowView() {
        // Setup the view UI
        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.add(new JLabel("Enter Cow ID (8 digits):"));
        panel.add(cowIdField);
        panel.add(submitButton);
        panel.add(resultLabel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Cow Milk Production");
        this.setSize(650, 170);
        this.add(panel);
    }

    public String getCowIdInput() {
        return cowIdField.getText();
    }

    public void setResultText(String text) {
        resultLabel.setText(text);
    }

    public void addSubmitButtonListener(ActionListener listener) {
        submitButton.addActionListener(listener);
    }
}
