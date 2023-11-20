import java.lang.reflect.Array;

/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class MinhaPilha <T>{
    private int iTopo;
    private T[] elementos;

    /*A instanciacao elementos = new T[iCapacidade] não é permitida*/
    /*Há duas soluções para se instanciar um array genérico em Java*/
    
    /*Solução 1: criar um array de objects e fazer cast, uma array de objects pode guardar qualquer tipo de objeto*/
    public MinhaPilha(int iCapacidade) {
        iTopo = 0;
        elementos = (T[]) new Object[iCapacidade];
    }
    /*Solução 2: usar java.lang.reflect.Array para criar o array, nesse caso o construtor pede a propriedade class da class T*/
    public MinhaPilha(Class<?> classeT, int iCapacidade) {
        iTopo = 0;
        elementos = (T[]) Array.newInstance(classeT, iCapacidade);        
    }    
    public boolean estaVazia(){
        return iTopo == 0;
    }
    public boolean estaCheia(){
        return iTopo == elementos.length;
    }
    
    public void push(T elemento) throws PilhaCheiaException {
        if (this.estaCheia()) 
            throw new PilhaCheiaException();
        
        elementos[iTopo] = elemento;
        iTopo++;
    }
 
    public T pop() throws PilhaVaziaException{
        if (this.estaVazia())
            throw new PilhaVaziaException();
        T elemento = elementos[iTopo - 1];
        elementos[iTopo - 1] = null;
        iTopo--;
        return elemento;
    }
}
