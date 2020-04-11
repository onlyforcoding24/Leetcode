package Arrays;

public class AddBinary {

    public static void main(String[] args) {
        
        String a = "11";
        String b = "1";

        String c = addBinary(a, b);
        System.out.println(c);
    }

    public static String addBinary(String a, String b){
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        StringBuffer sb = new StringBuffer();
        while( j>=0 || i>=0){
            int sum = carry;
            if(i >= 0) {
                sum = sum + a.charAt(i--) - '0';
            }
            if(j>=0){
                sum = sum + b.charAt(j--) - '0';
            }

            sb.append(sum%2);
            carry = sum/2;

        }

        if(carry == 1){
            sb.append(1);
        }

        return sb.reverse().toString();
    }

}