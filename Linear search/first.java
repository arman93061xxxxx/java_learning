
public class first {
public static void main(String[] args) {  
  int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
  int target =19;
  int ans = linearSearch(nums, target);
  System.out.println("index "+ans +" element "+linearSearch2(nums,target)+" is present ??");
  System.out.println(linearSearch3(nums,target));
}
    
    // ------search in the array: return the index if item ClassNotFoundException----------------
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target){
     if (arr.length == 0) {
            return -1;
        }
            for (int i = 0; i < arr.length; i++){
                // check for element at every index if it is = target 
                int element = arr[i];
                if(element == target){
                    return i;
                }
            }
     return -1; // in case array empty or element not found       
        
    }
    
    
    // ------search the target and returnthe element---------------- 
       static int linearSearch2(int[] arr, int target){
     if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
            for (int element : arr){
                // check for element at every index if it is = target 
                
                if(element == target){
                    return element;
                }
            }
     return Integer.MAX_VALUE; // in case array empty or element not found       
       // return this here coz -1 may be some element in array. 
    }
    
    
    
    // ------search the target and true/false---------------- 
       static boolean linearSearch3(int[] arr, int target){
     if (arr.length == 0) {
            return false;
        }
            for (int element : arr){
                // check for element at every index if it is = target 
                
                if(element == target){
                    return true;
                }
            }
     return false; // in case array empty or element not found       
        
    }
}