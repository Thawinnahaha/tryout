import javax.swing.*;

public class SimpleUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Title goes here");

        JTextField textField = new JTextField(20);
        JButton button = new JButton("Click me");
        JCheckBox checkBox = new JCheckBox("Works or nah");

        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);
        panel.add(checkBox);


        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JOptionPane.showMessageDialog(frame, "Welcome to Simple UI");

        button.addActionListener(e -> {

            if (!checkBox.isSelected()) {
                JOptionPane.showMessageDialog(
                        frame,
                        "Please tick the checkbox first!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            String text = textField.getText();
            JOptionPane.showMessageDialog(
                    frame,
                    text,
                    "Text",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });
    }
}
