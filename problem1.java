//Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons.

public class problem1{
public static int minimum(int array []){
   int curr = 0;
   int min = Integer.MAX_VALUE;
  for(int i = 0 ; i < array.length;i++){
     curr = array[i];
   if (curr < min ){
    min= curr;

       }
   }
return min ;
} 
public static int maximum(int array []){
  int curr = 0 ;
  int max = Integer.MIN_VALUE;
for (int i =0 ; i< array.length; i++){
  curr = array[i];
  if (curr > max){
   max= curr ;
     }
  }
  return max ;
} 
 public static void main(String [] args){
  int array[] = {1,2,3,4,5,56,73};
   System.out.println("the Maximum  of in array"+ minimum(array));
   System.out.println("the minimum of in array"+ maximum(array));
   }
}
//time =0.0400 sec ,space = 39.028MB ,Time Complexity: O(N) ,Auxiliary Space: O(1)