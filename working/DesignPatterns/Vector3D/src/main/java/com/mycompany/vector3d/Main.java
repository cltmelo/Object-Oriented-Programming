/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vector3d;

/**
 *
 * @author lucas
 */
public class Main {
    public static void main(String[] args) {
        Vector3D v = new Vector3D(5, 10, -3);
        Vector3D u = new Vector3D(-1, 2, 7);

        VectorOperation<double[]> sum = new Add();
        VectorOperation<Integer> dot = new DotProduct();
        VectorOperation<double[]> cross = new CrossProduct();

        System.out.println("Adição: " + arrayToString(sum.performOperation(v, u)));
        System.out.println("Produto interno: " + dot.performOperation(v, u));
        System.out.println("Produto vetorial: " + arrayToString(cross.performOperation(v, u)));
    }

    private static String arrayToString(double[] array) {
        StringBuilder result = new StringBuilder("[");
        for (double value : array) {
            result.append(value).append(", ");
        }
        result.delete(result.length() - 2, result.length()).append("]");
        return result.toString();
    }
}

