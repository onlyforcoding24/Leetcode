package leetcodechallenge.week1;

import java.util.HashSet;
import java.util.Set;

public class happyNumber {

    // Write an algorithm to determine if a number n is "happy".
    // A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
    // Return True if n is a happy number, and False if not.

    public static void main(String[] args) {
        boolean a = isHappyNumber(342);
        System.out.println(a);
    }

    public static boolean isHappyNumber(int n){
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        while(true){

            while(n != 0){
                int digit = n % 10;
                n = n/10;
                sum += digit*digit;
            }

            if(set.contains(sum)){
                return false;
            } else {
                set.add(sum);
            }

            if(sum == 1){
                return true;
            }

            n = sum;
            sum = 0;
        }
    }

}