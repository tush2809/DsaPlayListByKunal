package com.spark.BinarySearch;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
          int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89 };
          int target=22;
          int ans=binarySearchAlgorithm(arr,target);
        System.out.println(ans);
    }
     static int binarySearchAlgorithm(int[] arr, int target){
           if(arr.length==0){
               return -1;
           }
           int start=0;
           int end=arr.length-1 ;
           while (start<=end) {
               //int mid = (start+end)/2;
//might be possible that (start + end) exceeds range of integer
           int mid = start + (end- start)/2;
               if (arr[mid] == target) {
                   return mid;
               } else if (arr[mid] < target) {
                   start = mid + 1;
               } else {
                   end = mid - 1;
               }
           }
         return -1;
     }

}
