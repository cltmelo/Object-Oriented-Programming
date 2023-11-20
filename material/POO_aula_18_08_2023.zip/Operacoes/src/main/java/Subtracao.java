/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 5832884
 */
public class Subtracao extends Operacao{
    public Subtracao(float operador1, float operador2) {
        super(operador1, operador2);
    }
    /*overwrite - sobreescrita*/
    public float operar(){        
        return this.getOperador1() - this.getOperador2();
    }
    
    public void oQueEASubtracao(){
        System.out.println("A subtracao se da pela diferenca entre os operadores");
    }
}
