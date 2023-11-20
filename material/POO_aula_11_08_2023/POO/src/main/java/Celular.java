/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2373891
 */
public class Celular {
    Processador p;
    SSom s;

    public Celular(Processador p, SSom s) {
        this.p = p;
        this.s = s;
    }
    
    public void funcionar(){
        this.p.imprimir();
        this.s.fazBarulho();
    }
}
