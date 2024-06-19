package com.spark.recurssion;

public class RecursionProblem {
    public static void main(String[] args) {
         //print(1);
       // System.out.println(fibonacciNumber(4));

        int[] arr ={72,78,87,99,105,150,454};

        System.out.println(binarySearchUsingRecurssion(arr, 150,0, arr.length-1));
    }


    static void print(int n) {
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //this is tail recursion.
        print(n + 1);
    }

    //find nth fibonacci Number
    //0  1  2  3  4  5  6  7
    //0, 1, 1, 2, 3, 5, 8, 13......
    // fibo(N) = fibo(N-1) + fibo(N-2)
    static int fibonacciNumber(int n) {
        if(n<2) {
            return n;
        }
        return fibonacciNumber(n-1) + fibonacciNumber(n-2);
    }



     static int binarySearchUsingRecurssion(int[] arr, int target,int start, int end){
           if(start>end) {
               return -1;
           }
           int mid = start+ (end-start)/2;
           if(arr[mid]==target){
               return mid;
           } else if (arr[mid]<target ) {
               int temp = binarySearchUsingRecurssion( arr, target,mid+1, end);
                return temp;
           }else {
               int temp = binarySearchUsingRecurssion( arr, target,start, mid-1);
               return  temp;
           }


     }







  }
