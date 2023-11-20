/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jfrju
 */
public class Carro {
    private String modelo;
    private String fabricante;
    private int ano;
    private Tanque tanque;
    private Pneu[] pneus;

    public Carro(String modelo, String fabricante, int ano, String tipoComb) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
        tanque = new Tanque(tipoComb);
        
        pneus = new Pneu[4];
        pneus[0] = new Pneu(20,"Pireli");
        pneus[1] = new Pneu(20,"Pireli");
        pneus[2] = new Pneu(20,"Goodyear");
        pneus[3] = new Pneu(20,"Goodyear");
    }
    
    public void descreveCarro(){
        System.out.println(this);
        System.out.println("O carro possui pneus: ");
        for(int i = 0; i < pneus.length; i++)
            System.out.println(pneus[i].descreve());
        System.out.println("e tambem possui um tanque:");
        System.out.println(tanque.descreve());
    }
    
    //sobreescrita
    public String toString(){
        return "Carro do fabricante " + fabricante + ", modelo " + modelo + ", ano " + ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public int getAno() {
        return ano;
    }
    
}
