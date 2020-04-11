package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum{

    public static void main(String[] args) {
        int[] sums = {-1, -1, 0, 0, 1, 1};
        // -1 1 0 1 -1,0
        // -1 -1 0 0 1 1
        System.out.println(find3Sum(sums));
    }

    // [0,0,0,0]

    public static List<List<Integer>> find3Sum(int[] nums){
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            int left = i + 1;
            int right = nums.length - 1;

            if(i > 0 && nums[i] == nums[i - 1]) continue;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    triplets.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left < right && nums[left] == nums[left+1]) left++;
                    while(left < right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;

                }else if(sum < 0){
                        left++;
                    } else {
                        right--;
                    }
                }
        }
        return triplets;
    }
}