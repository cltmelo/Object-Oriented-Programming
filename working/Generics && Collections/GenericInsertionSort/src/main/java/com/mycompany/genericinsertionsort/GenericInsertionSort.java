/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.genericinsertionsort;

/**
 *
 * @author lucas
 */
public class GenericInsertionSort<T extends Compare> {

    public void insertionSort(T[] a) {
        for (int j=0; j<a.length; j++){
            T tmp = a[j];
            int i = j-1;
            while(i>=0 && a[i].compareTo(tmp)>0){
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = tmp;
        }
    }
    
    public static void main(String[] args) {
        Compare[] compareArray = { new Compare(5),
            new Compare(15),
            new Compare(10),
            new Compare(7),
            new Compare(19),
            new Compare(-2),
            new Compare(3),
            new Compare(-3),
            new Compare(0),
            new Compare(0),
            new Compare(1)
        };
        
        GenericInsertionSort<Compare> compareSorter = new GenericInsertionSort<>();
        
        System.out.println("Array antes da ordenação:");
        printArray(compareArray);
        
        compareSorter.insertionSort(compareArray);
        
        System.out.println("Array após a ordenação:");
        printArray(compareArray);
    }
    
    public static <T> void printArray(T[] a){
        for(T elem : a){
            System.out.println(((Compare)elem).getValor() + " ");
        }
            System.out.println();
    }
}


/* Caso eu não tivesse implmentado a classe Compare e apenas Comparable:

public static void main(String[] args) {
        // Teste com Integer
        Integer[] intArray = {5, 2, 9, 1, 5, 6, 8, 3, 7, 4};
        GenericInsertionSort<Integer> intSorter = new GenericInsertionSort<>();
        
        System.out.println("Array antes da ordenação:");
        printArray(intArray);

        intSorter.insertionSort(intArray);

        System.out.println("\nArray depois da ordenação:");
        printArray(intArray);

        // Teste com Float
        Float[] floatArray = {5.2f, 2.8f, 9.1f, 1.7f, 5.4f, 6.3f, 8.9f, 3.6f, 7.0f, 4.5f};
        GenericInsertionSort<Float> floatSorter = new GenericInsertionSort<>();
        
        System.out.println("\n\nArray antes da ordenação:");
        printArray(floatArray);

        floatSorter.insertionSort(floatArray);

        System.out.println("\nArray depois da ordenação:");
        printArray(floatArray);
    }

*/
