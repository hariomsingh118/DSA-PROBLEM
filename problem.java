public class problem {
    public static int maxSubArray(int[] nums) {
        int curr = 0 ;
        int maximum = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i ++){
            curr += nums[i];
            maximum= Math.max( curr , maximum );

            if(curr < 0 ){
                curr = 0;
            }
        }
      return maximum;  
    }
    public static void main (String args [] ){
        int nums [] = {-1,-3,-5,-6,-2,-5};
       System.out.print(maxSubArray(nums));
    }
}
//leetcode problem 53. Maximum Subarray  :- Given an integer array nums, find the subarray with the largest sum, and return its sum.