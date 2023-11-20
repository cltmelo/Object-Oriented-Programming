/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.usp.abstractshape;

/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class Circle extends AbstractShape{

    public Circle(float fMedida1) {
        super(fMedida1, 0.0f);
    }
    
    public float area() {
        return this.getfMedida1() * this.getfMedida1() * 3.14f;
    } 
}
