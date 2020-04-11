package leetcodechallenge.week1;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int nums[] = {4,0,5,0,1,2,3};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }

    public static int[] moveZeroes(int [] nums){

        // 4,0,5,0,1,2,3
        int i = 0;
        int j = 0;

        while(j < nums.length){
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }

        while(i < nums.length){
            nums[i++] = 0;
        }
        return nums;
    }
}