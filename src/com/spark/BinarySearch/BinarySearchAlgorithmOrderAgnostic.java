package com.spark.BinarySearch;

public class BinarySearchAlgorithmOrderAgnostic {

    public static void main(String[] args) {
        // int[] arr={1,2,3,4,5,6,7,8,9};
        int[] arr={9,8,7,6,5,4,3,2,1};
         int target=8;
        System.out.println(orderAgnostic(arr,target));
    }

    static int orderAgnostic(int[] arr, int target){
         if(arr.length==0){
             return -1;
         }
         boolean isAsc = arr[0]<arr[arr.length-1];
         int start=0;
         int end= arr.length-1;
         while (start<=end){
             int mid=start+(end-start)/2;
             if(arr[mid]==target){
                 return mid;
             }
             if (isAsc){
                 if (arr[mid]<target){
                      start=mid+1;
                 }else if(arr[mid]>target){
                     end=mid-1;
                 }
             }else {
                 if (arr[mid]>target){
                     start=mid+1;
                 }else if(arr[mid]<target){
                     end=mid-1;
                 }

             }
         }
         return -1;
    }
}
