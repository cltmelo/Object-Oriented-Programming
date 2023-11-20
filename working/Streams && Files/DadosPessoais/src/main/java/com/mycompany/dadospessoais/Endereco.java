/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dadospessoais;

import java.io.Serializable;

/**
 *
 * @author lucas
 */
public class Endereco implements Serializable {
    private String rua;
    private String cidade;
    private int num;
    private static final long serialVersionUID = 1L; // Número de série para controle de versão

    public Endereco(String rua, String cidade, int num) {
        this.rua = rua;
        this.cidade = cidade;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Endereco{" + "rua=" + rua + ", cidade=" + cidade + ", num=" + num + '}';
    }
    
    

}
