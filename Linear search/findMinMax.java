import java.util.*;

public class findMinMax {
	public static void main(String[] args) {
		int arr[]={18,12,-7,3,14,28};
		System.out.println("minimum val in array is "+min(arr));
		System.out.println("max val in array is "+max(arr));
	}
	
	
	// assume arr.length != 0
	// return minimum value in arr
	static int min(int[] arr){
	    int ans = arr[0];
	    for(int i=1; i < arr.length;i++){
	        if (arr[i] < ans){
	            ans = arr[i];
	        }
	    }
	   return ans; 
	}
	
	// return max value in array
		static int max(int[] arr){
	    int ans = arr[0];
	    for(int i=1; i < arr.length;i++){
	        if (arr[i] > ans){
	            ans = arr[i];
	        }
	    }
	   return ans; 
	}
}
