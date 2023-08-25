package cuenta;

public class cliente {
  
    private String nombre; 
    private String apellido;    
    cuenta cuenta [];

    public cliente(String nombre, String apellido, cuenta[] cuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double consultarSaldo(int indice){
        
        return cuenta [indice].getSaldo();
    
    }
    
    public void ingresarDinero(int indice, double cantidad){
        
       cuenta[indice].depositarDinero(cantidad);
       
    }
     
    public void retirarDinero (int indice, double cantidad){
       cuenta[indice].retirarDinero(cantidad);
    }
     
}
