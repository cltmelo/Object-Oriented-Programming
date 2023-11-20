/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stringobservavel;

import java.util.Observable;

/**
 *
 * @author lucas
 */
public class StringObservavel extends Observable{
    private String observado;

    public StringObservavel() {
        this.observado = "STRING 2023 6";
    }
    public void setString(String observado) {
        if(!this.observado.equals(observado)){
            this.setChanged();
        }
        this.observado = observado;
        this.notifyObservers();
        
    }

    public String getString() {
        return observado;
    }
    
    
}
