import javax.swing.*;
import java.awt.*;


public class p140_HolaMundoGUI extends JFrame {
    private JLabel lblSaludo;

    public p140_HolaMundoGUI(){
        setLayout(null);
        lblSaludo = new JLabel("Hola Mundo");
        lblSaludo.setFont(new Font("Tahoma", Font.BOLD + Font.ITALIC, 30));
        lblSaludo.setBounds(50, 140, 400, 30);
        add(lblSaludo);
    }
    public static void main(String[] args) {
        p140_HolaMundoGUI app = new p140_HolaMundoGUI();

        app.setBounds(10, 10, 400, 300);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
