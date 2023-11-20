/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class PilhaVaziaException extends Exception{
    PilhaVaziaException(){
        super("ERROR: a pilha esta vazia, nao pode fazer pop");
    }
}
