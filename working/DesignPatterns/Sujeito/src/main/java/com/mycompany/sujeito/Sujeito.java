/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sujeito;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Sujeito {

    private List<Observador> observadores = new ArrayList<>();
    
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(String mensagem) {
        for (Observador observador : observadores) {
            observador.notificar(mensagem);
        }
    }
    
    public void realizarAcao() {
        // Lógica da ação
        System.out.println("Realizando alguma ação no sujeito.");

        // Notificar observadores
        notificarObservadores("A ação foi realizada!");
    }
}
