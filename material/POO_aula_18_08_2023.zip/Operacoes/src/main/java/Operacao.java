/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 5832884
 */
public abstract class Operacao {
    private float operador1;
    private float operador2;

    public Operacao(float operador1, float operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }
    
    public void meMostreOsOperadores(){
        System.out.println("Os operadores sao " + this.getOperador1() + " e " + this.getOperador2());
    }
    
    public abstract float operar();

    public float getOperador1() {
        return operador1;
    }

    public void setOperador1(float operador1) {
        this.operador1 = operador1;
    }

    public float getOperador2() {
        return operador2;
    }

    public void setOperador2(float operador2) {
        this.operador2 = operador2;
    }


}
