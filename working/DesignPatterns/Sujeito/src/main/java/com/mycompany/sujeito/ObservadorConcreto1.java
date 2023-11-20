/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sujeito;

/**
 *
 * @author lucas
 */
public class ObservadorConcreto1 implements Observador {

    @Override
    public void notificar(String mensagem) {
        System.out.println("Observador 1 recebeu a mensagem: " + mensagem);
    }
    
}
