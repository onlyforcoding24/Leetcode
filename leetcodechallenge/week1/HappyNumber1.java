package leetcodechallenge.week1;

public class HappyNumber1 {

    public static void main(String[] args) {
        int n = 342;
        boolean a = isHappyNum(n);
        System.out.println(a);
    }

    public static boolean isHappyNum(int n){
        while(true){
            if(n == 1){
                return true;
            }
            n = squareN(n);
            if(n == 4){
                return false;
            }
        }
    }

    public static int squareN(int n){
        int sum = 0;
        while(n > 0){
            int digit = n%10;
            n = n/10;
            sum += digit*digit;
        }
        return sum;
    }

}