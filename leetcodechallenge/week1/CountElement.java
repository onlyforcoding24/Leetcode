package leetcodechallenge.week1;

import java.util.HashSet;
import java.util.Set;

public class CountElement {

    //Given an integer array arr, count element x such that x + 1 is also in arr.
    //If there're duplicates in arr, count them seperately.

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,5,5,7,7};
        System.out.println(countElements(arr));
    }

    public static int countElements(int [] arr){
        Set<Integer> set = new HashSet<>();

        for(int i : arr){
            set.add(i);
        }

        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i]+1)){
                count++;
            }
        }
        return count;
    }
}