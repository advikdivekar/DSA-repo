package Array;

import java.util.Arrays;

public class largestelement_brute {
    public static void main(String[] args) {
        //intialise the array
        int[] arr = {1,2,5,6,9,10,21,12,20};

        //sort the array
        Arrays.sort(arr);
        
        //largest number
        int largest = arr[arr.length - 1];

        //print the largest number
        System.out.println("largest element:" + largest);  
    }
}
