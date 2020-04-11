package Arrays;

public class ThirdLargest {

    public static void main(String[] args) {
        int a[] = {6,2,7,1,3,9};
        System.out.println(thirdLargest(a));
    }

    public static int thirdLargest(int [] arr){

        int firstL = 0;
        int secondL = 0;
        int thirdL = 0;

        // 6,2,7,1,3,9

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > firstL){
                thirdL = secondL;
                secondL = firstL;
                firstL = arr[i];
            } else if(arr[i] > secondL){
                thirdL = secondL;
                secondL = arr[i];
            } else if(arr[i] > thirdL){
                thirdL = arr[i];
            }
        }
        return thirdL;
    }

}