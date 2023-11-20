/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 5832884
 */
public class Coeficiente extends Operacao{
    public Coeficiente(float operador1, float operador2) {
        super(operador1, operador2);
    }
    /*overwrite - sobreescrita*/
    public float operar(){        
        if(this.getOperador2() == 0){
            System.out.println("ERRO: operador 2 nao pode ser 0");
            return -1;
        }
        return this.getOperador1() / this.getOperador2();
    }
    
    public void comoUsarOCoeficiente(){
        System.out.println("O coeficiente define a relacao fracionaria entre dois operandos");
    }
}