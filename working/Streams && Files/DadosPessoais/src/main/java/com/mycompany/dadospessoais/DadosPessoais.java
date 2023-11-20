/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dadospessoais;

import java.io.Serializable;

/**
 *
 * @author lucas
 */
public class DadosPessoais implements Serializable {
    private Endereco endereco;
    private int idade;
    private String nome;
    private static final long serialVersionUID = 1L; // Número de série para controle de versão

    public DadosPessoais(Endereco endereco, int idade, String nome) {
        this.endereco = endereco;
        this.idade = idade;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "DadosPessoais{" + "endereco=" + endereco + ", idade=" + idade + ", nome=" + nome + '}';
    }
}
