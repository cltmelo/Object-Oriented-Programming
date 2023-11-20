/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class PilhaCheiaException extends Exception{

    public PilhaCheiaException() {
        super("ERROR: a pilha excedeu sua capacidade, nao pode fazer push");
    }
    
}
