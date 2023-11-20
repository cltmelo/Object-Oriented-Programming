/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vector3d;

/**
 *
 * @author lucas
 */
public class Add implements VectorOperation<double[]> {

    @Override
    public double[] performOperation(Vector3D v, Vector3D u) {
        double[] result = new double[3];
        
        result[0] = v.x + u.x;
        result[1] = v.y + u.y;
        result[2] = v.z + u.z;
        
        return result;
    }
}
