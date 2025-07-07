public class problem5 {
    public static boolean problem(int array []){
        int n = array.length ;
        for(int i = 0 ; i < n ; i++){
            int ans = array[i];
            for(int j = i+1 ; j < n;j++){
                int end = array[j];
                if(ans==end){
                    return true ;
                }
            }
        }
        return false ;
    }
    public static void main (String args []){
        int array [] = {1,1,1,3,3,4,3,2,4,2};
       System.out.print(problem(array)); 
    }
}
