import java.util.Scanner;  // imp for input all variables all inputs we'll take 

public class functionORmethod{

static void table(int c) {    //  STATIC coz MAIN is STATIC
      for (int i=1;i<=10;i++){
        int temp = c*i;
        System.out.println(c+"x"+i+"="+temp);
      }
}
  static void main() {  
    Scanner sc = new Scanner(System.in);   // imp for input all variables all inputs we'll take 
    System.out.print("Enter number ");
        int n = sc.nextInt();  // important for inpput taking input of n in it 
      table(n);
  }
}