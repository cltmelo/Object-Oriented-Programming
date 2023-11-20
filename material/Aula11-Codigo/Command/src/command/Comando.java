package command;

/**
 *
 * @author Junio
 */
public abstract class Comando {
    public void Executa(){
        System.out.println("Oi");
        System.out.println("Faço um monte de coisas antes");
        Comportamento(); /*Específico para cada classe*/
        System.out.println("Faço um monte de coisas depois");
        System.out.println("Tchau!");
    }
    public abstract void Comportamento();
}
