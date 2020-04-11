package leetcodechallenge.week1;

public class MaxSubArray {

    //Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
    
    public static void main(String[] args) {
        int a[] = {-1,3,-1,-2,2,-3,3,-1,4,-1};
        System.out.println(maxSubArraySum(a));
    }

    /**
     * KADAN's Algorithm......
     * we find the max sum of consecutive subarray from given array
     * consider 1st element as a maxSum and currentSum
     * iterate over each element from an array except 1st element(1 -> N-1) 
     * check if currentSum is less than 0. If it is then assign currentSum as current iterated element(currentSum = array[i]). 
     * else add the current element to currentSum and assign it to currentSum (currentSum = currentSum + array[i])
     * then check if maxSum is less than currentSum or not. 
     * if it is then assing currentSum to maxSum. 
     * iterate till end. 
     * then return the maxSum. 
     * 
     */

    public static int maxSubArraySum(int[] nums){

        int maxSum = nums[0], currentSum = nums[0];
        for(int i=1; i<nums.length; i++){
            currentSum = currentSum < 0 ? nums[i] : (currentSum + nums[i]);
            if(maxSum < currentSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

}