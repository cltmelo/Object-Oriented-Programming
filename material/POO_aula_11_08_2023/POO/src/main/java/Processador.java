/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2373891
 */
public class Processador {
    String fabricante;
    int modelo;
    float clock;

    public Processador(String fabricante, int modelo, float clock){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.clock = clock;
    }
    
    public void imprimir(){
        System.out.println("Processador " + this.modelo + 
                ", fabricante " + this.fabricante + 
                ", clock " + this.clock);        
    }
}
