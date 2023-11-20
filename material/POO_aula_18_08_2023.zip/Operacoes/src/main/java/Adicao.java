/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 5832884
 */
public class Adicao extends Operacao{
    String operador;
    
    public Adicao(float operador1, float operador2, String sOperador) {
        super(operador1, operador2);
        this.operador = sOperador;

    }
    /*overwrite - sobreescrita*/
    public float operar(){        
        return this.getOperador1() + this.getOperador2();
    }
    
    public void descrevaAAdicao(){
        System.out.println("A adicao usa o operador +");
    }
    
    
}
