package observator;

import java.util.Scanner;

/**
 *
 * @author Junio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObjetoObservavel oObservado1 = new ObjetoObservavel();
        ObjetoObservavel oObservado2 = new ObjetoObservavel();


        ObservadorSoma osSoma = new ObservadorSoma();
        ObservadorProduto osProduto = new ObservadorProduto();     
        
        oObservado1.addObserver(osSoma);
        oObservado1.addObserver(osProduto);

        oObservado2.addObserver(osSoma);
        oObservado2.addObserver(osProduto);
        
        
        Scanner scan = new Scanner (System.in);
        while(true){
            System.out.println("Entre com um novo X:");
            oObservado1.setX(scan.nextInt());
            //oObservado2.setX(scan.nextInt());            
            System.out.println("Entre com um novo Y:");
            oObservado1.setY(scan.nextInt());
            //oObservado2.setY(scan.nextInt());            
            
            //oObservado2.notifyObservers();            
        }

    }

}
