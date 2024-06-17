package com.spark.linearSearch;

public class LinearSearchForString {
    public static void main(String[] args) {
        String input="Tushar Sabane";
        char target='T';
        System.out.println(searchString(input,target));
    }
    static boolean searchString(String str,char target){
         if(str.length()==0){
             return false;
         }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target){
              return true;
            }
        }
      return false;
    }
}
