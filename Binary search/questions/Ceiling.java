
public class Ceiling {

    // Function to find the ceiling of a number
    static int ceiling(int[] arr, int target) {

      if (target > arr[arr.length - 1]) {
            return -1; // Ceiling does not exist
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } 
            else if (target > arr[mid]) {
                start = mid + 1;
            } 
            else {
                return arr[mid];
            }
        }

       
            return arr[start];
    }
    

    // Function to find the floor of a number
    static int floor(int[] arr, int target) {

      if (target < arr[0]) {
            return -1; // Floor does not exist
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } 
            else if (target > arr[mid]) {
                start = mid + 1;
            } 
            else {
                return arr[mid];
            }
        }

        // End points to the largest element smaller than target
            return arr[end];
      
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 9, 11, 14, 18, 21};
        int target = 10;

        System.out.println("Target: " + target);
        System.out.println("Floor: " + floor(arr, target));
        System.out.println("Ceiling: " + ceiling(arr, target));
    }
}
