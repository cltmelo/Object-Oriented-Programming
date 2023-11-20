package com.mycompany.divida;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import com.mycompany.divida.Divida;

/**
 *
 * @author lucas
 */
public class DividaLiquida extends Divida {

    @Override
    public String getDescricao() {
        return "Dívida Líquida ";
    }

    @Override
    public float getPreco() {
        return 1000f;
    }
    
}
