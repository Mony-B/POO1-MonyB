import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class p144_Temperaturas extends JFrame implements ActionListener {
    
    private JLabel lblTemp, lblResultado;
    private JTextField txtTemp;
    private JRadioButton rdbFahrenheitACelsius, rdbCelsiusAFahrenheit;
    private JButton btnConvertir, btnSalir;
    private ButtonGroup grupoOpciones;
    
    public p144_Temperaturas() {
        super("Conversor de Temperatura");
        setLayout(null);
        
        lblTemp = new JLabel("Temperatura:");
        lblTemp.setBounds(10, 20, 100, 30);
        add(lblTemp);
        
        txtTemp = new JTextField();
        txtTemp.setBounds(110, 20, 150, 30);
        add(txtTemp);
        
        rdbFahrenheitACelsius = new JRadioButton("Fahrenheit a Celsius");
        rdbFahrenheitACelsius.setBounds(10, 60, 200, 30);
        add(rdbFahrenheitACelsius);
        
        rdbCelsiusAFahrenheit = new JRadioButton("Celsius a Fahrenheit");
        rdbCelsiusAFahrenheit.setBounds(10, 90, 200, 30);
        add(rdbCelsiusAFahrenheit);
        
        grupoOpciones = new ButtonGroup();
        grupoOpciones.add(rdbFahrenheitACelsius);
        grupoOpciones.add(rdbCelsiusAFahrenheit);
        
        btnConvertir = new JButton("Convertir");
        btnConvertir.setBounds(30, 130, 100, 40);
        add(btnConvertir);
        
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(150, 130, 100, 40);
        add(btnSalir);
        
        lblResultado = new JLabel("(Aquí va el resultado)");
        lblResultado.setBounds(30, 180, 200, 30);
        add(lblResultado);
        
        btnConvertir.addActionListener(this);
        btnSalir.addActionListener(this);
    }
    
    public float convertirAFahrenheit(float celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public float convertirACelsius(float fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por usar el programa", "Adiós", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } else if (e.getSource() == btnConvertir) {
            try {
                float temp = Float.parseFloat(txtTemp.getText());
                float resultado;
                
                if (rdbFahrenheitACelsius.isSelected()) {
                    resultado = convertirACelsius(temp);
                    lblResultado.setText(String.format("%.2f °F = %.2f °C", temp, resultado));
                } else if (rdbCelsiusAFahrenheit.isSelected()) {
                    resultado = convertirAFahrenheit(temp);
                    lblResultado.setText(String.format("%.2f °C = %.2f °F", temp, resultado));
                } else {
                    JOptionPane.showMessageDialog(this, "Selecciona una opción de conversión", "Error", JOptionPane.WARNING_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Ingresa un valor numérico válido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public static void main(String[] args) {
        p144_Temperaturas app = new p144_Temperaturas();
        app.setBounds(0, 0, 300, 250);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
