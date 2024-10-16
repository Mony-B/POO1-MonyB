package p112_ControlVentas;

public class VentaCredito extends Venta {
        private int Meses;
        private double Intereses;
    
        public VentaCredito(String articulo, int cantidad, double precio, int meses, double intereses) {
            super(articulo, cantidad, precio);
            Meses = meses;
            Intereses = intereses;
        }

        @Override
        public double getTotalVenta() {
            Total = Total + (Meses * Intereses);
            return 0;
        }
    
        @Override
        public String toString() {
            return "VentaContado [" + super.toString() + "Meses=" + Meses + ", Intereses=" + Intereses + ", Total=" + getTotalVenta() + "]";
        }
        
    }