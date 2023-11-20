/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.meusvetores;

import java.util.Arrays;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        
        int[] conjunto1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] conjunto2 = new int[]{5, 6, 7, 8, 9, 10};
        MeusVetores conjuntos = new MeusVetores(conjunto1, conjunto2);
        
        MeusVetoresBrigde uniao = new Uniao();
        MeusVetoresBrigde intersecao = new Intersecao();
        MeusVetoresBrigde diferenca = new Diferenca();
        
        OperacaoVetoresFactory uniaoFactory = new UniaoFactory();
        OperacaoVetoresFactory intersecaoFactory = new IntersecaoFactory();
        OperacaoVetoresFactory diferencaFactory = new DiferencaFactory();
        
        OperacaoParaFactory fUniao = uniaoFactory.criarOperacao();
        OperacaoParaFactory fIntersecao = intersecaoFactory.criarOperacao();
        OperacaoParaFactory fDiferenca = diferencaFactory.criarOperacao();
        
        
        System.out.println("Conjunto 1: " + Arrays.toString(conjuntos.getConjunto1()));
        System.out.println("Conjunto 2: " + Arrays.toString(conjuntos.getConjunto2()));
        System.out.println("\n");
        
        System.out.println("Brigde");
        System.out.println("====================================================================");
        uniao.showResults(conjuntos);
        intersecao.showResults(conjuntos);
        diferenca.showResults(conjuntos);
        System.out.println("====================================================================");
        
        System.out.println("\n");
        
        System.out.println("Factory");
        System.out.println("====================================================================");
        int[] resultadoUniao = fUniao.executeOperation(conjunto1, conjunto2);
        fUniao.showResults(resultadoUniao);
        
        int[] resultadoIntersecao = fIntersecao.executeOperation(conjunto1, conjunto2);
        fIntersecao.showResults(resultadoIntersecao);
        
        int[] resultadoDiferenca = fDiferenca.executeOperation(conjunto1, conjunto2);
        fDiferenca.showResults(resultadoDiferenca);
        System.out.println("====================================================================");
    }
}
