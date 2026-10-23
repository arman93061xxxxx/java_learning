class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;
         
        while (start <= end){

            int mid = start + (end -start)/2;
            if(arr[mid] > arr[mid+1] && arr[mid]> arr[mid-1]){
                return mid;
            }
            else if (arr[mid] < arr[mid+1] ){
                start = mid+1;
            }
            else {
                end = mid -1;
            }
        }
        return -1;
    }
}

// LEETCODE 852. Peak Index in a Mountain Array
// also known as biotonic array. A mountain array is an array that has the following properties:
// 1. The array elements are strictly increasing up to a point (the peak)
// 2. After the peak, the array elements are strictly decreasing