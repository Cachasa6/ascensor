
import java.util.logging.Level;
import java.util.logging.Logger;

public class Elevador {
    private int piso_actual;
    private int piso_destino;
    private int i;
    
    public void setpiso_actual(int pa){piso_actual=pa;}
    public void setpiso_destino(int pd){piso_destino=pd;}
    
    public int getpiso_actual(){return piso_actual;}
    public int getpiso_destino(){return piso_destino;}
    
    public void mov(){
        if(piso_actual<piso_destino){
            for(i=piso_actual;i<piso_destino;i++){
                System.out.println("Piso "+1);
                try {Thread.sleep(1000);}
                catch(InterruptedException ex) {Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);}
            }
        }
        if (piso_actual>piso_destino){
            for(i=piso_actual;i>piso_destino;i--){
                System.out.println("Piso "+i);
                try {Thread.sleep(1000);}
                catch(InterruptedException ex) {Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);}
            }
        }
    }

    {
        
    }
    
}
