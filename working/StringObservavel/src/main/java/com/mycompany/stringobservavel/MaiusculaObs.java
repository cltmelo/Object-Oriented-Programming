/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stringobservavel;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author lucas
 */
public class MaiusculaObs implements Observer{
    private String newString;
    public void update(Observable o, Object arg){
        StringObservavel ooTemp = (StringObservavel) o;
        newString = ooTemp.getString().toUpperCase();
        System.out.println(newString);
        
    }
}
