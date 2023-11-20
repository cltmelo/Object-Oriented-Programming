/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 5832884
 */
public class Produto extends Operacao{
    public Produto(float operador1, float operador2) {
        super(operador1, operador2);
    }
    /*overwrite - sobreescrita*/
    public float operar(){        
        return this.getOperador1() * this.getOperador2();
    }
    
    public void porqueUsarOProduto(){
        System.out.println("O produto fornece a multiplicada de dois operandos");
    }
}
