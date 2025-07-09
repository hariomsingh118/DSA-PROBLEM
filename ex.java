import java.util.*;
public class ex {
    public static void moveZeroes(int[] nums) {
        int index = 0 ; 
        for(int i = 0 ; i < nums.length ;i++){
            if(nums[i] != 0){
            nums[index]=nums[i];
            index++;
          }
          System.out.print(nums);
        }
    }
    public static void main(String args [] ){
        int nums [] = {0,1,0,3,12};
        moveZeroes(nums);
    }
}