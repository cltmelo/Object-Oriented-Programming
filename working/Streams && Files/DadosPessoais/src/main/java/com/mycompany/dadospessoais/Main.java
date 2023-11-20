/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dadospessoais;

import java.io.*;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author lucas
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        // Criando instâncias de Endereco e DadosPessoais
        Endereco endereco = new Endereco("Rua ABC", "Cidade XYZ", 26);
        DadosPessoais dados = new DadosPessoais(endereco, 30, "João");

        // Escrevendo objetos no arquivo
        escreverObjetos(dados, "dados.dat");

        // Lendo objetos do arquivo
        DadosPessoais dadosLidos = (DadosPessoais) lerObjetos("dados.dat");


        // Exibindo objetos lidos
        System.out.println("Objeto lido do arquivo: " + dadosLidos);
    }

    private static void escreverObjetos(DadosPessoais object, String nomeArquivo) {
        try( FileOutputStream fos = new FileOutputStream(nomeArquivo); GZIPOutputStream gzos = new GZIPOutputStream(fos); ObjectOutputStream oos = new ObjectOutputStream(gzos)) {
            
            oos.writeObject(object);
            System.out.println("Objeto escrito no arquivo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static DadosPessoais lerObjetos(String nomeArquivo) throws ClassNotFoundException {
        DadosPessoais dados = null;
        
        try( FileInputStream fis = new FileInputStream(nomeArquivo); GZIPInputStream gzis = new GZIPInputStream(fis); ObjectInputStream ois = new ObjectInputStream(gzis)) {
            
            dados = (DadosPessoais) ois.readObject();
            System.out.println("Objeto lido do arquivo com sucesso!");
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + nomeArquivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return dados;
        
    }
}
