/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sujeito;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        Sujeito sujeito = new Sujeito();

        Observador observador1 = new ObservadorConcreto1();
        Observador observador2 = new ObservadorConcreto2();

        sujeito.adicionarObservador(observador1);
        sujeito.adicionarObservador(observador2);

        // Realizar uma ação que notificará os observadores
        sujeito.realizarAcao();

        // Remover um observador
        sujeito.removerObservador(observador1);

        // Realizar outra ação
        sujeito.realizarAcao();
    }
}
