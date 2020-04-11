package Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int a[] = {6,4,66,78,2,67};
        System.out.println(secondLargest(a));
    }

    public static int secondLargest(int[] array){

        int largest = 0;
        int secondLargest = 0;

        // 6,4,66,78,2,67,78
        // secondLargest < currentElem && currentEle > largst
        // then secondLargest = currentElement

        for(int i = 0; i < array.length; i++){
            if(array[i] > largest){
                secondLargest = largest;
                largest = array[i];
            } else if(secondLargest < array[i]){
                secondLargest = array[i];
            }
        }
        return secondLargest;
    }

}