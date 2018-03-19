

import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.Console;

public class Usuario {
        
    public static void main(String[] args) {
        Console operador = System.console();
        Elevador piso = new Elevador();
        
        operador.printf("BIENVENIDO A SU ELEVADOR\nusted esta en el piso 0(PB),a que piso desea ir? (1-16):");
        int p=0;
        do{
            piso.setpiso_actual(p);
            piso.setpiso_destino(Integer.parseInt(operador.readLine ()));
            
            if(piso.getpiso_destino()!=piso.getpiso_actual()){
                piso.mov();
                p=piso.getpiso_destino();
                piso.setpiso_actual(p);
                System.out.println("Ahora usted esta en el piso "+piso.getpiso_actual());
            }
            else{if(piso.getpiso_actual()==piso.getpiso_destino()){
                System.out.println("Usted esta ahi...");
        }}
        
        System.out.println("Las puestas estan abiertas puede bajar...");
        
        try {Thread.sleep(2000);}
        catch(InterruptedException ex) {Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);}
        operador.printf("las puertas estan cerradas,¿a que piso desea ir?(1-10); ");
        
        }while(p<11);

    }
    
}
