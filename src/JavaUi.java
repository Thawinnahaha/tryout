import javax.swing.*;
import javax.swing.text.html.Option;

public class JavaUi {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JOptionPane OptionPane = new JOptionPane();

        panel.add(OptionPane);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);

        OptionPane.setMessage("Hello World");
    }
}
