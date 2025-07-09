import java.util.Arrays;
public class problem7 {
    public static void movezero(int arr []){
        int index = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }

        } 
        while(index < arr.length){
            arr[index] = 0;
            index++;
        }
        System.out.print(Arrays.toString(arr));
    }
    public static void main(String args []){
        int arr [] = {0,1,0,3,12};
        movezero(arr);
    }
    
}
//problem 283 :- move zero :- easy:- submit :- leetcode :-
// Given an integer array nums, move all 0's to the end of 
//it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
