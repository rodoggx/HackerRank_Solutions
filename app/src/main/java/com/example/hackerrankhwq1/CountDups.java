package com.example.hackerrankhwq1;

import java.util.HashSet;

public class CountDups {
    //Step 1: Create 2 hash sets. 1 is for all the elements and the other is for the duplicate elements.
    static int countDups(int[] numbers) {
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> duplicateSet = new HashSet<Integer>();

        //Step 2: Loop over each element in the given array
        for(int i=0;i<numbers.length;i++){
          //a. Check whether element is in the Hash set
            if(set.contains(numbers[i])){
               // If yes, then add it to duplicate set
                duplicateSet.add(numbers[i]);
            }else{
                // If no, then add it to normal hash set
                set.add(numbers[i]);
            }
        }
//output the size of duplicate hash set
        return duplicateSet.size();
    }

    public static void main(String p[]){
        int a[]={1,3,1,4,5,6,3,2,5};
        System.out.println("The array contains " +countDups(a) + " duplicate values.");
    }

}