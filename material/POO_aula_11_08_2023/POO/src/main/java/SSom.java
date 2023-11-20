/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2373891
 */
public class SSom {
    int dbMax;
    String fabricante;
    int volumeAtual;

    public SSom(String fabricante, int volumeAtual) {
        this.fabricante = fabricante;
        this.volumeAtual = volumeAtual;
    }
    
    public SSom(String fabricante){
        this.fabricante = fabricante;
        this.volumeAtual = 0;
        this.dbMax = 100;
    }
    
    public void fazBarulho(){
        System.out.println("SOM SOM SOM - Volume" + this.volumeAtual);                
    }
    
}    
