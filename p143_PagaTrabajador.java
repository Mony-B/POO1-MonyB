import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p143_PagaTrabajador extends JFrame implements ActionListener {

    private JLabel lblNombre, lblHoras, lblPaga, lblTasa, lblResultado;
    private JTextField txtNombre, txtHoras, txtPaga, txtTasa;
    private JButton btnCalcular, btnSalir;

    public p143_PagaTrabajador() {
        super("Cálculo de Pago de Trabajador");
        setLayout(null);
        
        lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(10, 20, 100, 30);
        add(lblNombre);
        
        txtNombre = new JTextField();
        txtNombre.setBounds(120, 20, 150, 30);
        add(txtNombre);
        
        lblHoras = new JLabel("Horas Trabajadas:");
        lblHoras.setBounds(10, 60, 150, 30);
        add(lblHoras);
        
        txtHoras = new JTextField();
        txtHoras.setBounds(120, 60, 150, 30);
        add(txtHoras);
        
        lblPaga = new JLabel("Pago por hora:");
        lblPaga.setBounds(10, 100, 100, 30);
        add(lblPaga);
        
        txtPaga = new JTextField();
        txtPaga.setBounds(120, 100, 150, 30);
        add(txtPaga);
        
        lblTasa = new JLabel("Tasa de impuesto:");
        lblTasa.setBounds(10, 140, 150, 30);
        add(lblTasa);
        
        txtTasa = new JTextField();
        txtTasa.setBounds(140, 140, 130, 30);
        add(txtTasa);
        
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 190, 100, 40);
        add(btnCalcular);
        
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(150, 190, 100, 40);
        add(btnSalir);
        
        lblResultado = new JLabel("(Aquí va el resultado)");
        lblResultado.setBounds(10, 240, 300, 100); 
        add(lblResultado);
        
        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public void calcularPago() {
        try {
            String nombre = txtNombre.getText();
            int horas = Integer.parseInt(txtHoras.getText());
            double paga = Double.parseDouble(txtPaga.getText());
            double tasa = Double.parseDouble(txtTasa.getText()) / 100; 
            
            double pagabruta = horas * paga;
            double impuesto = pagabruta * tasa;
            double paganeta = pagabruta - impuesto;
            
            lblResultado.setText("Trabajador: " + nombre + "   Paga Bruta: " + String.format("%.2f", pagabruta) + 
                     "   Impuesto: " + String.format("%.2f", impuesto) + 
                     "   Paga Neta: " + String.format("%.2f", paganeta));


        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingresa valores numéricos válidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por usar el programa", "Adiós", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else if (e.getSource() == btnCalcular) {
            calcularPago();
        }
    }
    
    public static void main(String[] args) {
        p143_PagaTrabajador app = new p143_PagaTrabajador();
        app.setBounds(0, 0, 300, 400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
