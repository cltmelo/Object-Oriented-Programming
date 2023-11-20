/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stringobservavel;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Main {
     public static void main(String[] args) {
        StringObservavel oObservado1 = new StringObservavel();
        MaiusculaObs upperCase = new MaiusculaObs();
        ConcatenaAnoObs concatCase = new ConcatenaAnoObs();
        
        oObservado1.addObserver(upperCase);
        oObservado1.addObserver(concatCase);
        
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("\nNova string: ");
            oObservado1.setString(scan.nextLine());
        }
        
        
    }
}
