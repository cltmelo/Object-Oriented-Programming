package com.mycompany.number;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author lucas
 */
public interface Chain {
    void setNextChain(Chain nextChain);
    void calculate(Number request);
}
