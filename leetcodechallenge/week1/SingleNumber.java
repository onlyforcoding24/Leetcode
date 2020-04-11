package leetcodechallenge.week1;

public class SingleNumber {

    //Given a non-empty array of integers, every element appears twice except for one. Find that single one.
    //Note:
    //Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

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