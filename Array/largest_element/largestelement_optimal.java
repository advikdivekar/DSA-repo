package Array.largest_element;

public class largestelement_optimal{
    public static void main(String[] args){
        
        //initialise the array
        int[] arr = {1,3,4,2,32,45,12,34,87,54,24};
        
        //consider the first element as the largest element i.e. arr[0];
        
        int largest = arr[0];
        
        //compare the rest of the elements with the largest, update the value if new largest found while comparison and store it in largest
        
        for (int i = 1; i<arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest element:" + largest);
    }
}