package cuenta;
public class cuenta {
    
    private int numero_cuenta;
    private double saldo;

    public cuenta(int numero_cuenta, double saldo) {
        this.numero_cuenta = numero_cuenta;
        this.saldo = saldo;
    }

    public int getNumero_cuenta() {
        return numero_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    
        public void depositarDinero (double cantidad ){
            saldo += cantidad;        
        }
    
        public void retirarDinero (double cantidad) {
            saldo -= cantidad;
            
        }
    
    
}
