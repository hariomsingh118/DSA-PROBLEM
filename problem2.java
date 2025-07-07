// Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements such that 
//the first element becomes the last, the second element becomes second last and so on.
class problem{
public static void reverse(int array []){
    int temp ;
    int start = 0;
    int end = array.length-1;
while(start < end){
    temp = array[start] ;
    array[start] = array[end] ;
    array[end] = temp ;
    
    start++;
    end--;
  }
  for(int i =0 ; i < array.length ; i ++){
      System.out.print(array[i]+" ");
  }
}
public static void main (String args[]){
  int array[] = {1,2,3,4,5};
  reverse(array);
  }
}
// Time: 0.0500 secs , Memory:39.172 Mb , 



/*// Java Program to reverse an array using temporary array

import java.util.Arrays;

class GfG {
    
    // function to reverse an array
    static void reverseArray(int[] arr) {
        int n = arr.length;
        
        // Temporary array to store elements in reversed order
        int[] temp = new int[n];
  
        // Copy elements from original array to temp in reverse order
        for (int i = 0; i < n; i++)
            temp[i] = arr[n - i - 1];
  
        // Copy elements back to original array
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 2, 6, 5 };

        reverseArray(arr);
  
        for (int i = 0; i < arr.length; i++) 
            System.out.print(arr[i] + " ");
    }
}
 */
// Time: 0.0400 secs , Memory:39.068 Mb , 
