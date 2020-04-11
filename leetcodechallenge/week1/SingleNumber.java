package leetcodechallenge.week1;

import java.util.Arrays;

public class SingleNumber {

    public static void main(String[] args) {

        int nums [] = {5,2,1,2,3,1,3};

        System.out.println(singleNumber(nums));
        
    }

    public static int singleNumber(int nums[]){
        int single = 0;

        for(int x : nums){
            single = single ^ x;
        }

        return single;
    }

}