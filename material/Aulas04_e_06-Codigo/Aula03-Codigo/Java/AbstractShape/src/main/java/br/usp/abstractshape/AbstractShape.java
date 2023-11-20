/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.usp.abstractshape;

/**
 *
 * @author Jose F Rodrigues-Jr
 */
public abstract class AbstractShape {
    private float fMedida1;
    private float fMedida2;

    public AbstractShape(float fMedida1, float fMedida2) {
        this.fMedida1 = fMedida1;
        this.fMedida2 = fMedida2;
    }
    public final void descricao(){
        System.out.println("Esta é uma classe abstrata para dar suporte as classes que descrevem diferentes shapes.");
    }
    
    public static float calculaOQuadrado(float f){
        return f*f;
    }
    
    public abstract float area();

    public float getfMedida1() {
        return fMedida1;
    }

    public void setfMedida1(float fMedida1) {
        this.fMedida1 = fMedida1;
    }

    public float getfMedida2() {
        return fMedida2;
    }

    public void setfMedida2(float fMedida2) {
        this.fMedida2 = fMedida2;
    }
    
    public static void main(String[] args) {
        AbstractShape[] as = new AbstractShape[3];
        as[0] = new Rectangle(2.0f,3.0f);
        as[1] = new TriangleRectangle(2.0f,3.0f);
        as[2] = new Circle(2.0f);
        for(AbstractShape shape : as){
            System.out.println(shape.area());
        }
        System.out.println(AbstractShape.calculaOQuadrado(3));
    }
}
