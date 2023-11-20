/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacomproxy;

/**
 *
 * @author lucas
 */
public class SistemaReal implements SistemaComProxyOuDecorator {

    @Override
    public void metodo1(String parametro) {
        System.out.println("Método 1 executado com sucesso.");
    }

    @Override
    public void metodo2(String parametro) {
        System.out.println("Método 2 executado com sucesso.");
    }
    
}
