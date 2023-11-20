/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistema;

/**
 *
 * @author lucas
 */
public class Sistema {

    public void metodo1(String parametro) {
        System.out.println("Parametro setado: " + parametro);
        
        if ("789".equals(parametro)) {
            System.out.println("Vulnerabilidade detectada no método 1.");
        } else {
            System.out.println("Método 1 executado com sucesso.");
        }
        
        System.out.println();
    }

    public void metodo2(String parametro) {
        System.out.println("Parametro setado: " + parametro);
        
        if ("789".equals(parametro)) {
            System.out.println("Vulnerabilidade detectada no método 2.");
        } else {
            System.out.println("Método 2 executado com sucesso.");
        }
        
        System.out.println();
    }

    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        // Exemplo de chamada do método 1
        sistema.metodo1("123"); // Saída esperada: Método 1 executado com sucesso.
        sistema.metodo1("789"); // Saída esperada: Vulnerabilidade detectada no método 1.

        // Exemplo de chamada do método 2
        sistema.metodo2("456"); // Saída esperada: Método 2 executado com sucesso.
        sistema.metodo2("789"); // Saída esperada: Vulnerabilidade detectada no método 2.
    }
}
