import java.util.*;
public class Binary { 
  public static void main(String[] args) {
    int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    int target = 14;
    int ans = binarySearch(arr, target);
    System.out.println(ans != -1 ? "Target found at index: " + ans : "Target not found");
   
  }

  // Returns the index of the target if found, otherwise returns -1
  
 static int binarySearch(int[] arr, int target) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (arr[mid] == target) {
        return mid; // Target found
      } else if (arr[mid] < target) {
        start = mid + 1; // Search in right half
      } else {
        end = mid - 1; // Search in the left half
      }
    }

    return -1; // Target not found
  } 
}