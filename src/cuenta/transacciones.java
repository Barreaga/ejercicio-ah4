package cuenta;

  import java.util.Scanner;

public class transacciones {
    
public static int buscarNumeroDeCuenta(cuenta cuenta[], int numeroDeCuentaAbucar){
    
int indice = 0; 
int iterador = 0; 
    boolean numeroDeCuentaEncontrada = false;
    

{

    if(cuenta[iterador].getNumero_cuenta()== numeroDeCuentaAbucar){
         numeroDeCuentaEncontrada = true;
     indice = iterador; 
        
        
    }
    iterador ++;
  } 
    if (numeroDeCuentaEncontrada == false){
     
        indice = -1;
        
    }
    return indice;

}

    public static void main (String [] args){
    
        Scanner teclado = new Scanner  (System.in);
        String nombre, apellido, dpi; 
        cuenta cuenta [];
        cliente   cliente; 
        int numero_cuenta, cantidadCuentas,opcion,indiceNumeroCuenta; 
        double saldo, cantidadDinero;
         
        
        
      System.out.print("\nDigite el nombre del cliente: ");
        nombre = teclado. next ();
        
      System.out.println("Digite el apellido del cliente: ");
        apellido = teclado. next(); 
          
        
      System.out.print("\nAhora digite el numero de cuentas que tiene el cliente:  ");
      cantidadCuentas = teclado.nextInt();
      
      System.out.println("");
    
       cuenta = new cuenta [cantidadCuentas];
       
       
      for (int i = 0 ;i < cuenta.length ; i++){
       
        System.out.print("\nDigite la " + (i + 1 ) + " cuenta: ");  
        numero_cuenta = teclado.nextInt();
          
          System.out.print("Digite el saldo de la cuenta: ");
          
          saldo = teclado.nextDouble();
          cuenta [i] = new cuenta (numero_cuenta, saldo);
      
      } 
      
      cliente  = new  cliente (nombre, apellido, cuenta);
      
      do{
      
        System.out.println(" \nMenu");
        System.out.println("1 . ABONAR SALDO");
        System.out.println("2 . DEBITAR SALDO DE LA CUENTA ");
        System.out.println("3 . CONSULTAR SALDO");
        System.out.println("4 . SALIR");
        System.out.print("\nDigite una opcion: ");
        
        opcion = teclado.nextInt();
        
      switch (opcion){  
        
       case 1: 
       System.out.println("\nDigite el numero de cuenta: ");
       numero_cuenta = teclado.nextInt();
       indiceNumeroCuenta =  buscarNumeroDeCuenta(cuenta, numero_cuenta);  
       
       if (indiceNumeroCuenta == -1){
                System.out.println("\nCuenta no encontrada "); 
           
       }else {
           System.out.println("Digite la cantidad de dinero a Abonar: ");
           cantidadDinero = teclado.nextDouble();
           
           cliente.ingresarDinero(indiceNumeroCuenta, cantidadDinero);           
                      System.out.println("\n¡Deposito exitoso! ");
                      System.out.println("Saldo Disponible : "  + cliente.consultarSaldo(indiceNumeroCuenta));

       } 
       break;
       
      case 2:
           System.out.println("\nDigite el numero de cuenta: ");
           numero_cuenta = teclado.nextInt();
           indiceNumeroCuenta =  buscarNumeroDeCuenta(cuenta, numero_cuenta); 
          
          if (indiceNumeroCuenta == 1){
              System.out.println("\nNo existe pendiente ");
              System.out.println("");
          }else{
          
              System.out.print("\nDigite La cantidad de dinero a retirar:");
              cantidadDinero = teclado.nextDouble();
              
           if (cliente.consultarSaldo(indiceNumeroCuenta) < cantidadDinero) {
              System.out.print("Saldo insuficiente");
              System.out.print("");
           }else{
              cliente.retirarDinero(indiceNumeroCuenta, cantidadDinero); 
              System.out.println("");
              System.out.print("Retiro con exito");
              System.out.println("El saldo de la cuenta es: " + cliente.consultarSaldo(indiceNumeroCuenta)); 
              System.out.println("");
           }   
          }   
        break;
        
      case 3: 
          System.out.println("\nDigite el numero de cuenta: ");
       numero_cuenta = teclado.nextInt();
       indiceNumeroCuenta =  buscarNumeroDeCuenta(cuenta, numero_cuenta);  
       
       if (indiceNumeroCuenta == -1){
                System.out.println("\nCuenta no encontrada "); 
          
       }else{
           System.out.println("Saldo disponible: " + cliente.consultarSaldo(indiceNumeroCuenta));
           System.out.println("");
       }
        break;
        
      case 4:
          System.out.println("\nGracias por participar");
          opcion = 4;         
        break;  
      
      default: 
          System.out.println("\nOpcion no disponible, vuelva a intentar");
      }
        
      }while (opcion != 4); 
      }

    }
           
         


