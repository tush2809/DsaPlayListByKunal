package com.spark.BinarySearch;

public class BinarySearchProblems {
    public static void main(String[] args) {
          int[] arr={2,3,5,9,14,16,18};
          int target=15;
        //System.out.println(ceilingOfAGivenNumber(arr,target));

        //System.out.println(floorOfAGivenNumber(arr,target));

    }
      static int ceilingOfAGivenNumber(int[] arr,int n){

        if(n>arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while (start<=end){
          int  mid= start+ (end-start)/2;
            if(arr[mid]==n){
                return arr[mid];
            } else if (arr[mid]<n) {
                start=mid+1;
            }else if(arr[mid]>n){
                end=mid-1;
            }
        }
        return arr[start];
      }

    static int floorOfAGivenNumber(int[] arr,int n){

          if(n<arr[0]){
              return -1;
          }

          int start=0;
          int end=arr.length-1;
          while (start<=end){
              int mid = start+(end-start)/2;
              if(arr[mid]==n){
                   return arr[mid];
              } else if (arr[mid]<n) {
                  start=mid+1;
              }else {
                  end=mid-1;
              }
          }

          return arr[end];

    }




}
