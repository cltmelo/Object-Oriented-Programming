/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.usp.abstractshape;

/**
 *
 * @author Jose F Rodrigues-Jr
 */
public class TriangleRectangle extends AbstractShape {

    public TriangleRectangle(float fMedida1, float fMedida2) {
        super(fMedida1, fMedida2);
    }
    
    public float area() {
        return this.getfMedida1() * this.getfMedida2() * 0.5f;
    } 
}
