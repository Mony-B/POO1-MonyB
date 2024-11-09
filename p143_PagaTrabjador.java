import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p143_PagaTrabjador extends JFrame implements ActionListener {
    
    private JLabel lblNombre, lblHoras, lblPaga, lblResultado;
    private JTextField txtNombre, txtHoras, txtPaga;
    private JButton btnCalcular, btnSalir;
    
    public p143_PagaTrabjador() {
        super("Calcular el pago de un trabajador");
        setLayout(null);

        lblNombre = new JLabel("Nombre del Trabajador:");
        lblNombre.setBounds(10, 20, 200, 30);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(200, 20, 200, 30);
        add(txtNombre);

        lblHoras = new JLabel("Horas trabajadas:");
        lblHoras.setBounds(10, 60, 200, 30);
        add(lblHoras);

        txtHoras = new JTextField();
        txtHoras.setBounds(200, 60, 200, 30);
        add(txtHoras);

        lblPaga = new JLabel("Pago por hora:");
        lblPaga.setBounds(10, 100, 200, 30);
        add(lblPaga);

        txtPaga = new JTextField();
        txtPaga.setBounds(200, 100, 200, 30);
        add(txtPaga);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(50, 150, 150, 40);
        add(btnCalcular);

        btnSalir = new JButton("Salir");
        btnSalir.setBounds(220, 150, 150, 40); 
        add(btnSalir);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(10, 200, 400, 100);
        lblResultado.setPreferredSize(new Dimension(400, 100)); 
        add(lblResultado);

        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por utilizar este programa", "Salida", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else if (e.getSource() == btnCalcular) {
            String nombre = txtNombre.getText();
            int horas = Integer.parseInt(txtHoras.getText());
            double paga = Double.parseDouble(txtPaga.getText());
            double tasa = 0.03;

            double pagabruta = horas * paga;
            double impuesto = pagabruta * tasa;
            double paganeta = pagabruta - impuesto;

            lblResultado.setText("Trabajador: " + nombre + "\n" +
            "   Paga Bruta: " + String.format("%.2f", pagabruta) + "\n" +
            "   Impuesto: " + String.format("%.2f", impuesto) + "\n" +
            "   Paga Neta: " + String.format("%.2f", paganeta));
        }
    }

    public static void main(String[] args) {
        p143_PagaTrabjador app = new p143_PagaTrabjador();
        app.setBounds(0, 0, 450, 350); 
        app.setLocationRelativeTo(null); 
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
