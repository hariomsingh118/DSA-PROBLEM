public class problem4{
    public static   int  majorityelement(int array []){
        int n = array.length;
        int counter ;

        for(int i =0 ; i < n ; i++){
            int value = array[i];
             counter = 0 ;
        for(int j = 0 ; j < n ; j++){
            if(value == array[j]){
                counter ++ ;
            }
        }
        if(n/2 <= counter ){
            return value ;
        }
      }
       return -1 ;
    }
    public static void main (String args []){
        int array [] = {2,3,4,5,5,5,5};
       System.out.print(majorityelement(array));
    }
}