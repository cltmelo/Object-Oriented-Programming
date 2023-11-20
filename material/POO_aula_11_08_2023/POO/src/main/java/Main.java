/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2373891
 */
public class Main {
    public static void main(String[] args){
        Processador p1 = new Processador("Intel", 1000, 5);
        System.out.println(p1);
        p1.imprimir();
        
        Processador p2 = new Processador("AMD", 2000, 10);
        System.out.println(p2);
        p2.imprimir();
        
        SSom s1 = new SSom("JBL");
        SSom s2 = new SSom("Sony", 10);
        
        Celular c1 = new Celular(p1, s1);
        Celular c2 = new Celular(p2, s2);
        c1.funcionar();
        c2.funcionar();
    }    
}
