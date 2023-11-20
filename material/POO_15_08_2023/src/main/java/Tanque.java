/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jfrju
 */
public class Tanque {
    private int qtdComb;
    private String tipoComb;
    private String status;

    public Tanque(String tipoComb) {
        this.tipoComb = tipoComb;
        qtdComb = 0;
        status = "vazio";
    }
    
    public String pegaStatus(){
        return status;
    }

    public String pegaTipoComb() {
        return tipoComb;
    }
    
    public int pegaQtdComb() {
        return qtdComb;
    }

    public boolean acrescentaComb(int iVolume){
        int temp = qtdComb;
        qtdComb += iVolume;
        
        if(qtdComb > 100){
            qtdComb = temp;
            return false;
        }       
        determinaStatus();
        return true;
    }
    
    public boolean usaComb(int iVolume){
        int temp = qtdComb;
        qtdComb -= iVolume;
        
        if(qtdComb < 0){
            qtdComb = temp;
            return false;
        }
        determinaStatus();
        return true;
    }
    
    private void determinaStatus(){
        if(qtdComb == 100)
            status = "cheio";
        else if(qtdComb == 50)
            status = "meio";
        else if(qtdComb == 0)
            status = "vazio";
        else
            status = "possui combustivel";     
    }
    
    public String descreve(){
        return "Tanque com " + qtdComb + " litros de " + tipoComb;
    }
}
