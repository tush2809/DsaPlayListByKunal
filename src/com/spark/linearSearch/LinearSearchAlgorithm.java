package com.spark.linearSearch;

public class LinearSearchAlgorithm {

    public static void main(String[] args) {
        int[] arr={7,45,587,21,789,32,8};
        int target=21;
      int index =  linearSearch(arr,target);
        System.out.println(index);
    }
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }
}
