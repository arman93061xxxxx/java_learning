import java.util.*;

public class searchInRange {
	public static void main(String[] args) {
  int arr[]={18,12,-7,3,14,28};
   int target=3;
  System.out.println("index of 3 : "+linearSearch(arr,target,1,4));
  System.out.println("index of 18 : "+linearSearch(arr,18,1,4));
}

 static int linearSearch(int[] arr, int target , int start , int end){
     if (arr.length == 0) {
            return -1;
        }
            for (int i = start; i <= end; i++){
                // check for element at every index if it is = target 
                int element = arr[i];
                if(element == target){
                    return i;
                }
            }
     return -1; // in case array empty or element not found       
        
    }
}
