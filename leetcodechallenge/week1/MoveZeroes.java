package leetcodechallenge.week1;

import java.util.Arrays;

public class MoveZeroes {

    /*Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    Example:
    Input: [0,1,0,3,12]
    Output: [1,3,12,0,0]
    Note:
    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.
    */

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