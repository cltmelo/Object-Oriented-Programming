/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacomproxy;

/**
 *
 * @author lucas
 */
public class ProxySistema implements SistemaComProxyOuDecorator {
    private SistemaReal sistema;

    public ProxySistema() {
        this.sistema = new SistemaReal();
    }
    
    
    @Override
    public void metodo1(String parametro) {
        System.out.println("Parametro setado: " + parametro);
        if ("789".equals(parametro)) {
            System.out.println("Vulnerabilidade detectada no método 1.");
        } else {
            sistema.metodo1(parametro);
        }
        System.out.println();
    }

    @Override
    public void metodo2(String parametro) {
        System.out.println("Parametro setado: " + parametro);
        if ("789".equals(parametro)) {
            System.out.println("Vulnerabilidade detectada no método 2.");
        } else {
            sistema.metodo1(parametro);
        }
        System.out.println();
    }
    
}
