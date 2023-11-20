/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacomproxy;

/**
 *
 * @author lucas
 */
public class FilteredSistema implements SistemaComProxyOuDecorator {
    private SistemaComProxyOuDecorator sistemaDecorado;

    public FilteredSistema(SistemaComProxyOuDecorator sistemaDecorado) {
        this.sistemaDecorado = sistemaDecorado;
    }

    public void metodo1(String parametro) {
        if ("789".equals(parametro)) {
            parametro = "987";
        }
        sistemaDecorado.metodo1(parametro);
    }

    public void metodo2(String parametro) {
        if ("789".equals(parametro)) {
            parametro = "987";
        }
        sistemaDecorado.metodo2(parametro);
    }
}
