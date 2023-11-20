/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.genericlangnumber;


public class GenericNumber<T extends Number>{
    private T val1;
    private T val2;

    public GenericNumber(T val1, T val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public T getVal1() {
        return val1;
    }

    public void setVal1(T val1) {
        this.val1 = val1;
    }

    public T getVal2() {
        return val2;
    }

    public void setVal2(T val2) {
        this.val2 = val2;
    }
    
    

    @Override
    public String toString() {
        return "GenericNumber{" + "val1=" + getVal1() + ", val2=" + getVal2() + '}';
    }
    
    public T getMin(){
        return val1.doubleValue() <= val2.doubleValue() ? val1 : val2;
    }
    
    public T getMax(){
        return val1.doubleValue() >= val2.doubleValue() ? val1 : val2;
    }
    
    public static void main(String[] args) {
        GenericNumber<Integer> parInt = new GenericNumber<>(5, 10);
        System.out.println("ToString: " + parInt.toString());
        System.out.println("Min: " + parInt.getMin());
        System.out.println("Max: " + parInt.getMax());
        GenericNumber<Double> parDouble = new GenericNumber<>(5.4, 10.6);
        System.out.println("ToString: " + parDouble.toString());
        System.out.println("Min: " + parDouble.getMin());
        System.out.println("Max: " + parDouble.getMax());
    }
}
