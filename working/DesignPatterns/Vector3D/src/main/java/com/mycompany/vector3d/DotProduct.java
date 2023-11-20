/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vector3d;

/**
 *
 * @author lucas
 */
public class DotProduct implements VectorOperation<Integer> {

    @Override
    public Integer performOperation(Vector3D v, Vector3D u) {
        return (int)(v.x*u.x + v.y*u.y + v.z*u.z);
    }

}
