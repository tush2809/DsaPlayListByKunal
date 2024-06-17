package com.spark.arraysConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {
       // Scanner in = new Scanner(System.in);
          /*
              a =>  Stack Memory
        // object =>
               1,2,3 => Heap Memory
               4,5,6 => Heap Memory
               7,8,9 => Heap Memory
           */



        int[][] a = new int[3][];
        a= new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i < a.length; i++) {
              for (int j=0;j < a.length;j++){
                  //System.out.println(a[i][j]);
              }
        }

        int[][] b = new int[3][2];
      /*  b= new int[][]{
                {1,2,3},
                {4,5},
                {7,8,9,10}
        };*/

        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < b[row].length; col++) {
                 //b[row][col]= in.nextInt();
                //System.out.println(b[row][col]);
            }
        }

        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < b[row].length; col++) {
               // b[row][col]= in.nextInt();
              //  System.out.print(b[row][col] + " ");
            }
            //System.out.println();
        }


        int[][] c = new int[3][2];
       c= new int[][]{
                {1,2,3},
                {4,5},
                {7,8,9,10}
        };

       for (int[] arr:c){
           for (int inArr:arr){
               System.out.println(inArr);
           }
           //System.out.println(Arrays.toString(arr));
       }

        List<Integer> s = new ArrayList<>();
        s.add(10);
        System.out.println(s);
    }
}
