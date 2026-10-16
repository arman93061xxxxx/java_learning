public class Conditionals_and_Loops {
    public static void main(String[] args) {  // p s void main is entry point

        // IF
        int age = 20;
        if (age >= 18) {
            System.out.println("Adult");
        }

        // IF-ELSE
        int num = 5;
        if (num > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        // IF-ELSE-IF
        int marks = 80;
        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 60) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        // SWITCH
        int day = 1;
        // traditional switch old syntax 
        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     default:
        //         System.out.println("Other day");
        //               
 
        switch (day) {  // rule switch - new syntax
    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    default -> System.out.println("Other day");
}


        // FOR LOOP
        for (int i = 1; i <= 4; i++) {
            System.out.print(i);
        }
System.out.println(" ");
        // WHILE LOOP
        int i = 1;
        while (i <= 5) {
            System.out.print(i);
            i++;
        }
System.out.println(" ");
        // DO-WHILE LOOP
        int j = 1;
        do {
            System.out.print(j);
            j++;
        } while (j <= 5);
    }
}