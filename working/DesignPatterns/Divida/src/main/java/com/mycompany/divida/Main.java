/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.divida;

/**
 *
 * @author lucas
 */
public class Main {
    public static void main(String[] args) {
        Divida divida = new DividaLiquida();
        System.out.println(divida.getDescricao());
        System.out.println("Valor: R$" + divida.getPreco());
        
        Juros juros = new Juros(divida);
        System.out.println(juros.getDescricao());
        System.out.println(juros.getPreco());
        
        Taxa taxa = new Taxa(juros);
        System.out.println(taxa.getDescricao());
        System.out.println(taxa.getPreco());
    }
}
