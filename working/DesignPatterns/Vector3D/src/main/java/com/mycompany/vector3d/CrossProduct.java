/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vector3d;

/**
 *
 * @author lucas
 */
public class CrossProduct implements VectorOperation<double[]> {

    @Override
    public double[] performOperation(Vector3D v, Vector3D u) {
        double[] result = new double[3];
        
        result[0] = v.y * u.z - v.z * u.y;
        result[1] = v.z * u.x - v.x * u.z;
        result[2] = v.x * u.y - v.y * u.x;
        
        return result;
    }

}

/*
v x u = | i j k |
        | vx vy vz | = (vy*uz - vz*uy)i + (vz*ux - vx*uz)j + (vx*uy - vy*ux)k
        | ux uy uz |
*/
