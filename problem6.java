// Q = 136  , single number , Easy , 
//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
public class problem6 {
    public static int  singlenum(int array [] ){
        int ans = 0 ;
        for (int i = 0 ; i < array.length ; i ++){
            ans = ans^array[i];
        }
        return ans ;
    }
    public static void main (String args []){
        int array [] = {1,1,2,2,3,3,4,4,5};
       // singlenum(array);
        System.out.print(singlenum(array));
    }
}
