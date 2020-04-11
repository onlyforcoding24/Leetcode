package Arrays;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {

        int[] expArr = twoSum(new int[] {3, 5, -4, 8, 11, 1, -1, 6}, 10);
        System.out.println(Arrays.toString(expArr));

    }

    public static int[] twoSum(int array[], int targetSum){
        int outputArray[] = new int[2];
	
	for(int i = 0; i < array.length - 1; i++){
		for(int j = i+1; j < array.length; j++){
			if((array[i] + array[j]) == targetSum){
				if(array[i] > array[j]){
					outputArray[1] = array[i];
				outputArray[0] = array[j];
				return outputArray;
				} else {
					outputArray[0] = array[i];
				outputArray[1] = array[j];
				return outputArray;
				}
			}
		}
	}
		return new int[0];
    }
}