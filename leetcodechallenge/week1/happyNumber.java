package leetcodechallenge.week1;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class happyNumber {

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