


public class EvenDigit1295 { // even number of digits leetcode 1295
   public static void main(String[] args) {
    int[] nums = {-12,345,2,6,2896};
    System.out.println(findNumbers(nums));
        
   } 
   static int findNumbers(int[] nums){
    int count = 0;
    for (int num : nums) {
        if(even(num)){
            count++;
        }
    }
    return count;
   }
   
   
   // function to check whether even digits                 or not 
   public static boolean even(int num) {
       int no = digits(num);
    //   if (no % 2 == 0 ) {
    //       return true;
    //   }
    //   return false;
    
    return no % 2 ==0;
   }
   
   // count number of digits in a number 
//   public static int digits(int num) {
       
//       if (num <0) num *= -1; // negative number handling
//       if (num ==0) return 1;
//       int count =0;
       
//       while (num >0){
//           count ++;
//           num /= 10; // num = num/10
//       }
//       return count;
//   }

public static int digits(int num) {
       
       if (num <0) num *= -1; // negative number handling
      return (int)(Math.log10(num)+1);
   }
}