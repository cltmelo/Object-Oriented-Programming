/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Junio
 */
public class Amigo{
    public String name;
    public Amigo(String name) {
        this.name = name;
    }
    /*O método curva_se_a é synchronized, mas é chamado a partir de duas instâncias
      de objetos diferentes, portanto, evocado duas vezes*/
    public synchronized void curva_se_a(Amigo umAmigo) {
        System.out.println(this.name + ": " + umAmigo.name + " curvou-se para mim!");

        /*Esta contagem dá tempo para ocorra a alternancia entre threads
          Do contrário, a concorrência pode não acontecer */
        Counter c = new Counter();        
        c.fazerContagem();
        c.fazerContagem();
        c.fazerContagem();
        c.fazerContagem();
        System.out.println("Contagem concluída.");
        
        umAmigo.descurva_se(this);      
    }
    public synchronized void descurva_se(Amigo umAmigo) {
        System.out.println(this.name + ": " + umAmigo.name + " descurvou-se para mim!");
    }
}
