package Arrays;

public class AddBinary1 {

    public static void main(String[] args) {
        
        System.out.println(addBinary("11", "1"));

    }

    public static String addBinary(String a, String b){

        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int carry = 0;
        int i = 0;
        String res = "";

        while(i <= aLen || i <= bLen || carry != 0){
            int x = (i <= aLen) ? ((a.charAt(aLen - i) == '1') ? 1 : 0): 0;
            int y = (i <= bLen) ? ((b.charAt(bLen - i) == '1') ? 1 : 0) : 0;
            res = (x + y + carry)%2 + res;
            carry = (x + y + carry)/2;
            i++;
        }

        return res;
    }
}