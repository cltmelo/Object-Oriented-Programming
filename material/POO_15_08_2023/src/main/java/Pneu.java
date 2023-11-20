/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jfrju
 */
public class Pneu {
    private int tam;
    private String fabricante;

    public Pneu(int tam, String fabricante) {
        this.tam = tam;
        this.fabricante = fabricante;
    }

    public int getTam() {
        return tam;
    }

    public String getFabricante() {
        return fabricante;
    }
    
    public String descreve(){
        return  "Pneu de tamanho " + tam + " do fabricante " + fabricante;
    }
        
}
