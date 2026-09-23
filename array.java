// import java.util.Arrays;
// import java.util.Scanner;  


import java.util.*;  //easy way to imp lib it includes the most

public class array {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in        );
        
    // int arr[];        - declaration of array , arr is getting defined in the stack  {compile time}
   // arr = new int[5];  - initialization -here Objectis being created in the memory (heap)  {run time}  
    //  datatype variable name[] = new datatype[size];
    
       
       int arr[] = new int[5]; 
       
       int arr2[] = {1,2,3,4,5};
       arr2[2] = 23;
       System.out.println(arr2[2]);



     
        String str[] = new String[4];
        System.out.println(str[0]);
        System.out.println("Enter str aray input 4 time string");
          for ( int i = 0; i < str.length; i++) { //input
            str[i] = in.next();
        }
      System.out.println(Arrays.toString(str)); // easy way to print array - import java.util.Arrays; // remember to add this at top 
        


        System.out.println("Enter arr aray input 5 time ineger");
        for (int i = 0; i < arr.length; i++) { //input
            arr[i] = in.nextInt();
        }
        change(arr);
         for (int num :arr) {  //output
          System.out.print(num+" ");
        }
        
    
        
        
    }

    static void change(int change[]){
         change[0]= 99;  // mutable behaviour strings are not mitable in java but arrays are 
         
    }
}