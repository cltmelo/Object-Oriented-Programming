/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number;

/**
 *
 * @author lucas
 */
public class Main {

    public static void main(String[] args) {
        Chain chain1 = new Class1();
        Chain chain2 = new Class2();
        Chain chain3 = new Class3();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);

        Number number1 = new Number(8);
        Number number2 = new Number(9);
        Number number3 = new Number(7);
        
        chain1.calculate(number1);
        chain2.calculate(number2);
        chain3.calculate(number3);
    }
}
