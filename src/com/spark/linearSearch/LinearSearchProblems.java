package com.spark.linearSearch;

import java.util.Arrays;

public class LinearSearchProblems {
    public static void main(String[] args) {
        int[] inputArray={18,12,-7,3,14,28};
        int target=3;
        //System.out.println(searchInRange(inputArray, target, 1, 4));
       // System.out.println(findMinimumNumber(inputArray));

        int[][] inputMultiDimensionArray={
                {203,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int targetElement=12;
      //  System.out.println(Arrays.toString(searchIn2DArray(inputMultiDimensionArray, targetElement)));

      //  System.out.println(maximumNumberIn2DArray(inputMultiDimensionArray));
        int[] forFindEvenDigit={12,345,2,6,77896};
        //System.out.println(evenDigits(forFindEvenDigit));

        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }

    static  int searchInRange(int[] arr,int target,int start,int end){
        if(arr.length==0){
             return -1;
        }
        for (int i = start; i <= end; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    //assume arr.length !=0
    static int findMinimumNumber(int[] arr){
        int temp=arr[0];
        for (int i = 1; i <arr.length ; i++) {
                  if (temp>arr[i]){
                      temp=arr[i];
                  }
        }
        return temp;
    }

    //format of return value {row,col}
    static int[] searchIn2DArray(int[][] arr,int target){
         if (arr.length==0){
             return new int[]{-1, -1};
         }
        for (int row = 0; row <arr.length ; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1, -1};
    }
        //assume arr.length !=0
        static int maximumNumberIn2DArray(int[][] arr){
     int temp=arr[0][0];
      for (int row = 1; row < arr.length; row++) {
          for (int col = 1; col < arr[row].length; col++) {
              if (temp<arr[row][col]){
                  temp=arr[row][col];
              }
          }
      }
        return temp;
  }

      static int evenDigits(int[] nums){
          int count=0;
          for(int i=0;i<nums.length;i++){
              String s= String.valueOf(nums[i]);
              if(s.length()%2==0){
                  count++;
              }
          }
          return count;
      }

      static int maximumWealth(int[][] accounts){
          int temp=Integer.MIN_VALUE;
          int sum=0;
          for (int row = 0; row < accounts.length; row++) {
              sum=0;
              for (int col = 0; col < accounts[row].length; col++) {
                   sum +=accounts[row][col];
              }
              if(temp<sum){
                 temp=sum;

              }
          }
          return temp;
      }





}
