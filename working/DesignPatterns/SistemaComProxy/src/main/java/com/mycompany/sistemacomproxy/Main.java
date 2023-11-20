/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacomproxy;

/**
 *
 * @author lucas
 */
public class Main {
    public static void main(String[] args) {
        SistemaComProxyOuDecorator sistema = new ProxySistema();

        System.out.println("========================================================================\n");
        // Exemplo de chamada do método 1
        sistema.metodo1("123"); // Saída esperada: Método 1 executado com sucesso.
        sistema.metodo1("789"); // Saída esperada: Vulnerabilidade detectada no método 1.

        // Exemplo de chamada do método 2
        sistema.metodo2("456"); // Saída esperada: Método 2 executado com sucesso.
        sistema.metodo2("789"); // Saída esperada: Vulnerabilidade detectada no método 2.
        
        
        System.out.println("========================================================================\n");
        
        SistemaComProxyOuDecorator dSistema = new FilteredSistema(new SistemaReal());

        // Exemplo de chamada do método 1
        dSistema.metodo1("123"); // Saída esperada: Método 1 executado com sucesso. Parâmetro: 123
        dSistema.metodo1("789"); // Saída esperada: Método 1 executado com sucesso. Parâmetro: 987

        // Exemplo de chamada do método 2
        dSistema.metodo2("456"); // Saída esperada: Método 2 executado com sucesso. Parâmetro: 456
        dSistema.metodo2("789"); // Saída esperada: Método 2 executado com sucesso. Parâmetro: 987
    }
}
