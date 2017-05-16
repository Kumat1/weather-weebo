import javax.swing.*;

/**
 * Created by Kirana on 16/05/2017.
 */
public class Main extends JFrame {
    public Main() {
        super("Weather");
        setSize(350, 360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("City :");
        JLabel label1 = new JLabel("Temp");
        JLabel label2 = new JLabel("Descripton");
        JLabel label3 = new JLabel("Speed");
        JLabel label4 = new JLabel("Humidity");
        JLabel label5 = new JLabel("Pressure");
        JLabel label6 = new JLabel("Visibility");
        JLabel labelh1 = new JLabel("");
        JLabel labelh2 = new JLabel("");
        JLabel labelh3 = new JLabel("");
        JLabel labelh4 = new JLabel("");
        JLabel labelh5 = new JLabel("");
        JLabel labelh6 = new JLabel("");


        JTextField text = new JTextField();
        text.setEnabled(true);

        JButton button = new JButton("Check");

        label.setBounds(30, 30, 150, 30);
        label1.setBounds(30, 70, 150, 30);
        label2.setBounds(30, 110, 150, 30);
        label3.setBounds(30, 150, 150, 30);
        label4.setBounds(30, 190, 150, 30);
        label5.setBounds(30, 230, 150, 30);
        label6.setBounds(30, 270, 150, 30);
        labelh1.setBounds(100, 70, 150, 30);
        labelh2.setBounds(100, 110, 150, 30);
        labelh3.setBounds(100, 150, 150, 30);
        labelh4.setBounds(100, 190, 150, 30);
        labelh5.setBounds(100, 230, 150, 30);
        labelh6.setBounds(100, 270, 150, 30);
        text.setBounds(75, 30, 150, 30);
        button.setBounds(230, 30, 70, 30);

        panel.setLayout(null);
        panel.add(label);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(label5);
        panel.add(label6);
        panel.add(labelh1);
        panel.add(labelh2);
        panel.add(labelh3);
        panel.add(labelh4);
        panel.add(labelh5);
        panel.add(labelh6);
        panel.add(text);
        panel.add(button);
        add(panel);

        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Main app = new Main();
    }
}
