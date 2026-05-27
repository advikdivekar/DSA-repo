package Array.largest_element;

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

//Time complexity: O(nlogn) where n is the number of elements in the array due to sorting
//Space complexity: O(1) as we are using only one variable to store the largest element.
