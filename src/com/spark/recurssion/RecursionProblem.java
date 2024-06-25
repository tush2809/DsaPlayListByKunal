package com.spark.recurssion;

public class RecursionProblem {
    static int sum=0;
    public static void main(String[] args) {
         //print(1);
       // System.out.println(fibonacciNumber(4));
        int[] arr ={72,78,87,99,105,150,454};
        //System.out.println(binarySearchUsingRecurssion(arr, 150,0, arr.length-1));
        //System.out.println(factorialOfNumber(5));
        //System.out.println(sumOfDigit(1342));
        //System.out.println(productOfDigit(342));
        //decreaseConcept(5);
        //reverseANumber(2548);
        SecondWayForReverseANumber(5432);
        System.out.println(sum);
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
     static int binarySearchUsingRecurssion(int[] arr, int target,int start, int end) {
         if (start > end) {
             return -1;
         }
         int mid = start + (end - start) / 2;
         if (arr[mid] == target) {
             return mid;
         } else if (arr[mid] < target) {
             int temp = binarySearchUsingRecurssion(arr, target, mid + 1, end);
             return temp;
         } else {
             int temp = binarySearchUsingRecurssion(arr, target, start, mid - 1);
             return temp;
         }
     }

     static int factorialOfNumber(int n){
        if(n==1){
            return 1;
        }
        return n*factorialOfNumber(n-1);
     }

     static  int sumOfDigit(int n){
        if(n<=1){
            return n;
        }
        int rem = n/10;
        n =n%10;
        return n+sumOfDigit(rem);
     }

     static int productOfDigit(int n){
        if(n%10==n){
            return n;
        }
        int rem =n%10;
         n=n/10;
         return rem*productOfDigit(n);
     }

     static void decreaseConcept(int n){
        if(n==0){
            return;
        }
         System.out.println(n);
            decreaseConcept(n--);
     }

   static void reverseANumber(int n){
        if(n<=1){
            return;
        }
       System.out.println(n%10);
        reverseANumber(n/10);
   }


    static void SecondWayForReverseANumber(int n){
        if(n==0){
            return;
        }
        int rem =n%10;
        sum=sum*10+rem;
          SecondWayForReverseANumber(n/10);
    }

   // static boolean palindromeNumber(int n){

   // }

  }
