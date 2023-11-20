/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.divida;

/**
 *
 * @author lucas
 */
public abstract class DividaDecorator extends Divida {
    Divida dividaASerDecorada;
    
    protected DividaDecorator (Divida dividaASerDecorada) {
        super();
        this.dividaASerDecorada = dividaASerDecorada;
    }
    
}
