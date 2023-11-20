/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jose F Rodrigues-Jr
 * @param <C>
 */
public class SimpleGenericClass <C extends java.lang.Double> {
    private C dado;
    private C dado2;

    public void setDado(C dado) {
        this.dado = dado;
    }
    public void setDado2(C dado) {
        this.dado2 = dado;
    }    
    
    public Double getSum(){		
        return dado + dado2;
    }

}
