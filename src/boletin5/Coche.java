
package boletin5;

/**
 *
 * @author jpatriciodasilva
 */
public class Coche {
    
     private int velocidade ;

    public Coche(){
    velocidade =0 ;
    }
    
    //metodos
    public int getVelocidade(){
        return velocidade;
    } 
    public void Setacelerar (int valor){
     velocidade=velocidade+valor;   
        
    } 
    public void Setfrenar (int menos){
      velocidade=velocidade-menos;  
    }
    
}
    
  
