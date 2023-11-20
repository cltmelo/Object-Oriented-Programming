/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.divida;

/**
 *
 * @author lucas
 */
public class Taxa extends DividaDecorator {

    public Taxa(Divida dividaASerDecorada) {
        super(dividaASerDecorada);
    }

    @Override
    public String getDescricao() {
        return dividaASerDecorada.getDescricao() + "com Taxas (5%) ";
    }

    @Override
    public float getPreco() {
        return (float) (dividaASerDecorada.getPreco() + 0.05*dividaASerDecorada.getPreco());
    }
    
}
