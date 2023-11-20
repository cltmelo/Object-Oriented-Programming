/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.divida;

/**
 *
 * @author lucas
 */
public class Juros extends DividaDecorator {

    public Juros(Divida dividaASerDecorada) {
        super(dividaASerDecorada);
    }

    @Override
    public String getDescricao() {
        return dividaASerDecorada.getDescricao() + "com Juros (20%) ";
    }

    @Override
    public float getPreco() {
        return (float) (dividaASerDecorada.getPreco() + 0.2*dividaASerDecorada.getPreco());
    }
    
}
