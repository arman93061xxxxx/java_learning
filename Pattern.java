public class Pattern {
  public static void main(String[] args){

//  ##1
for (int p = 0; p < 5; p++) {
    for (int q= 0;q < p;q++) {
        System.out.print("*");
    }
    System.out.print("\n");
}

// ##2
  //Upper half :
for (int i = 1; i <= 5; i++) {

    // spaces
    for (int j = 1; j <= 5 - i; j++) {
        System.out.print(" ");
    }

    // stars
    if (i == 1) {
        System.out.print("*");
    } else {
        System.out.print("*");

        // inner spaces
        for (int j = 1; j <= 2 * i - 3; j++) {
            System.out.print(" ");
        }

        System.out.print("*");
    }

    System.out.println();
}

// Lower half :
for (int i = 5 - 1; i >= 1; i--) {

    // spaces
    for (int j = 1; j <= 5 - i; j++) {
        System.out.print(" ");
    }

    // stars
    if (i == 1) {
        System.out.print("*");
    } else {
        System.out.print("*");

        for (int j = 1; j <= 2 * i - 3; j++) {
            System.out.print(" ");
        }

        System.out.print("*");
    }

    System.out.println();
}

  }
}