
import java.util.*; 
public class array2d { 
 
 
  public static void main(String[] args) { 
       
      Scanner in = new Scanner(System.in); 
       
      // 2D Array : 
      /* 
            1 2 3 
            4 5 6  
            7 8 9  
     */ 
     // int [][] arr = new int[3][3]; 
      
    //  int [][] arr2 = { 
    //   {1,2,3},    //0th index 
    //   {4,5},     // 1st '' 
    //   {6,7,8,9}  // 2nd ''  = arr2[2] ={6,7,8,9} 
    //                         // arr2[2][1] = 6   
    //                  }; 
     
     
    int[][] arr = new int[3][2]; // no of colums is not imp to mention but rows is . can add if want to                                                   
    System.out.println(arr.length); //no of rows.  
      //input 
      for(int i = 0; i < arr.length; i++) { //input 
             
              for (int j = 0; j < arr[i].length; j++) {  
            arr[i][j] = in.nextInt(); 
        } 
             
                                            } 
    System.out.print("Array is :\n");                                          
    //output 
         
         
    /*     for (int i = 0; i < arr.length; i++) { //row 
             
              for (int j = 0; j < arr[i].length; j++) { //colum 
            System.out.print(arr[i][j]+" "); 
        } 
            System.out.print("\n"); 
                                            }   */ // lenthyy                                   
      
    // easy output Array.tostring()  
     
    // for (int i = 0; i < arr.length; i++){ 
    //     System.out.println(Arrays.toString(arr[i])); 
    // } 
     
    for (int[] a : arr){ 
        System.out.println(Arrays.toString(a)); 
    } 
      
                          


    // =====================================================================
    // =========================== GPT ADDITION =============================
    // =====================================================================
    // Everything above this comment is your original code.
    // The code below is additional code for learning 2D arrays.
    // =====================================================================


    // =====================================================================
    // GPT ADDITION 1 : ACCESSING ELEMENTS
    // =====================================================================

    System.out.println("\n\n========== GPT ADDITION 1 : ACCESSING ELEMENTS ==========");

    /*
        2D ARRAY:

             column
               0   1   2
             +---+---+---+
        row 0| 1 | 2 | 3 |
             +---+---+---+
        row 1| 4 | 5 | 6 |
             +---+---+---+
        row 2| 7 | 8 | 9 |
             +---+---+---+

        arr[row][column]

        Example:

        arr[0][0] -> first row, first column
        arr[0][1] -> first row, second column
        arr[1][0] -> second row, first column
    */

    System.out.println("arr[0][0] = " + arr[0][0]);
    System.out.println("arr[0][1] = " + arr[0][1]);
    System.out.println("arr[1][0] = " + arr[1][0]);
    System.out.println("arr[2][1] = " + arr[2][1]);


    // =====================================================================
    // GPT ADDITION 2 : UPDATING AN ELEMENT
    // =====================================================================

    System.out.println("\n\n========== GPT ADDITION 2 : UPDATING ==========");

    /*
        Suppose:

        arr[0][0] = 10

        We can change it using:

        arr[0][0] = 100;
    */

    System.out.println("Before updating:");
    System.out.println(Arrays.deepToString(arr));

    arr[0][0] = 100;

    System.out.println("After arr[0][0] = 100:");
    System.out.println(Arrays.deepToString(arr));


    // =====================================================================
    // GPT ADDITION 3 : SUM OF ALL ELEMENTS
    // =====================================================================

    System.out.println("\n\n========== GPT ADDITION 3 : SUM ==========");

    int sum = 0;

    for (int i = 0; i < arr.length; i++) {

        for (int j = 0; j < arr[i].length; j++) {

            sum = sum + arr[i][j];

        }
    }

    System.out.println("Sum of all elements = " + sum);


    // =====================================================================
    // GPT ADDITION 4 : MAXIMUM ELEMENT
    // =====================================================================

    System.out.println("\n\n========== GPT ADDITION 4 : MAXIMUM ==========");

    int max = arr[0][0];

    for (int i = 0; i < arr.length; i++) {

        for (int j = 0; j < arr[i].length; j++) {

            if (arr[i][j] > max) {

                max = arr[i][j];

            }
        }
    }

    System.out.println("Maximum element = " + max);


    // =====================================================================
    // GPT ADDITION 5 : MINIMUM ELEMENT
    // =====================================================================

    System.out.println("\n\n========== GPT ADDITION 5 : MINIMUM ==========");

    int min = arr[0][0];

    for (int i = 0; i < arr.length; i++) {

        for (int j = 0; j < arr[i].length; j++) {

            if (arr[i][j] < min) {

                min = arr[i][j];

            }
        }
    }

    System.out.println("Minimum element = " + min);


    // =====================================================================
    // GPT ADDITION 6 : SEARCHING AN ELEMENT
    // =====================================================================

    System.out.println("\n\n========== GPT ADDITION 6 : SEARCH ==========");

    System.out.print("Enter an element to search: ");

    int target = in.nextInt();

    boolean found = false;

    for (int i = 0; i < arr.length; i++) {

        for (int j = 0; j < arr[i].length; j++) {

            if (arr[i][j] == target) {

                System.out.println(
                    "Element found at row " + i +
                    " and column " + j
                );

                found = true;

            }
        }
    }

    if (!found) {

        System.out.println("Element not found.");

    }


    // =====================================================================
    // GPT ADDITION 7 : ROW-WISE SUM
    // =====================================================================

    System.out.println("\n\n========== GPT ADDITION 7 : ROW SUM ==========");

    for (int i = 0; i < arr.length; i++) {

        int rowSum = 0;

        for (int j = 0; j < arr[i].length; j++) {

            rowSum = rowSum + arr[i][j];

        }

        System.out.println(
            "Sum of row " + i + " = " + rowSum
        );
    }


    // =====================================================================
    // GPT ADDITION 8 : COLUMN-WISE SUM
    // =====================================================================

    System.out.println("\n\n========== GPT ADDITION 8 : COLUMN SUM ==========");

    /*
        Example:

        1  2
        3  4
        5  6

        Column 0:

        1
        3
        5

        Column 1:

        2
        4
        6
    */

    for (int j = 0; j < arr[0].length; j++) {

        int columnSum = 0;

        for (int i = 0; i < arr.length; i++) {

            columnSum = columnSum + arr[i][j];

        }

        System.out.println(
            "Sum of column " + j + " = " + columnSum
        );
    }


    // =====================================================================
    // GPT ADDITION 9 : SWAPPING TWO ELEMENTS
    // =====================================================================

    System.out.println("\n\n========== GPT ADDITION 9 : SWAP ==========");

    /*
        Suppose:

        arr[0][0] = first element
        arr[2][1] = last element

        We want to swap them.

        Before:

        1 2
        3 4
        5 6

        After:

        6 2
        3 4
        5 1
    */

    System.out.println("Before swap:");

    for (int[] row : arr) {

        System.out.println(Arrays.toString(row));

    }

    int temp = arr[0][0];

    arr[0][0] = arr[2][1];

    arr[2][1] = temp;

    System.out.println("After swap:");

    for (int[] row : arr) {

        System.out.println(Arrays.toString(row));

    }


    // =====================================================================
    // GPT ADDITION 10 : MAIN DIAGONAL
    // =====================================================================

    System.out.println("\n\n========== GPT ADDITION 10 : MAIN DIAGONAL ==========");

    /*
        Diagonal concepts are normally used with square matrices.

        Example:

        1 2 3
        4 5 6
        7 8 9

        Main diagonal:

        1
          5
            9

        Positions:

        [0][0]
        [1][1]
        [2][2]

        Pattern:

        arr[i][i]
    */

    int[][] square = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };

    System.out.println("Main diagonal:");

    for (int i = 0; i < square.length; i++) {

        System.out.print(square[i][i] + " ");

    }


    // =====================================================================
    // GPT ADDITION 11 : SECONDARY DIAGONAL
    // =====================================================================

    System.out.println("\n\n========== GPT ADDITION 11 : SECONDARY DIAGONAL ==========");

    /*
        Example:

        1 2 3
        4 5 6
        7 8 9

        Secondary diagonal:

            3
          5
        7

        Positions:

        [0][2]
        [1][1]
        [2][0]

        Formula:

        square[i][n - 1 - i]
    */

    int n = square.length;

    System.out.println("Secondary diagonal:");

    for (int i = 0; i < n; i++) {

        System.out.print(
            square[i][n - 1 - i] + " "
        );

    }


    // =====================================================================
    // GPT ADDITION 12 : TRANSPOSE
    // =====================================================================

    System.out.println("\n\n========== GPT ADDITION 12 : TRANSPOSE ==========");

    /*
        Original:

        1 2 3
        4 5 6

        Transpose:

        1 4
        2 5
        3 6

        Rule:

        transpose[j][i] = matrix[i][j]
    */

    int[][] matrix = {
        {1, 2, 3},
        {4, 5, 6}
    };

    int rows = matrix.length;

    int columns = matrix[0].length;

    int[][] transpose = new int[columns][rows];

    for (int i = 0; i < rows; i++) {

        for (int j = 0; j < columns; j++) {

            transpose[j][i] = matrix[i][j];

        }
    }

    System.out.println("Original matrix:");

    for (int[] row : matrix) {

        System.out.println(Arrays.toString(row));

    }

    System.out.println("Transpose:");

    for (int[] row : transpose) {

        System.out.println(Arrays.toString(row));

    }


    // =====================================================================
    // GPT ADDITION 13 : JAGGED ARRAY
    // =====================================================================

    System.out.println("\n\n========== GPT ADDITION 13 : JAGGED ARRAY ==========");

    /*
        Normal 2D array:

        1 2 3
        4 5 6
        7 8 9

        Every row has the same number of elements.


        Jagged array:

        1 2 3
        4 5
        6 7 8 9

        Different rows can have different lengths.
    */

    int[][] jagged = {
        {1, 2, 3},
        {4, 5},
        {6, 7, 8, 9}
    };

    System.out.println("Number of rows = " + jagged.length);

    for (int i = 0; i < jagged.length; i++) {

        System.out.println(
            "Row " + i +
            " has " + jagged[i].length +
            " elements"
        );

    }

    System.out.println("Jagged array:");

    for (int i = 0; i < jagged.length; i++) {

        for (int j = 0; j < jagged[i].length; j++) {

            System.out.print(jagged[i][j] + " ");

        }

        System.out.println();

    }


    // =====================================================================
    // GPT ADDITION 14 : Arrays.deepToString()
    // =====================================================================

    System.out.println("\n\n========== GPT ADDITION 14 : deepToString ==========");

    /*
        For a 1D array:

        Arrays.toString(arr)

        Example:

        [1, 2, 3]


        For a complete 2D array:

        Arrays.deepToString(arr)

        Example:

        [[1, 2, 3], [4, 5, 6]]
    */

    System.out.println(
        Arrays.deepToString(square)
    );


    // =====================================================================
    // GPT ADDITION 15 : IMPORTANT LENGTH CONCEPT
    // =====================================================================

    System.out.println("\n\n========== GPT ADDITION 15 : LENGTH ==========");

    /*
        VERY IMPORTANT FOR DSA.


        For:

        int[][] jagged = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };


        jagged.length

        means:

        NUMBER OF ROWS


        jagged[0].length

        means:

        NUMBER OF ELEMENTS IN ROW 0


        jagged[1].length

        means:

        NUMBER OF ELEMENTS IN ROW 1


        jagged[2].length

        means:

        NUMBER OF ELEMENTS IN ROW 2


        Therefore:

        arr.length
            -> number of rows

        arr[i].length
            -> number of elements in row i

        arr[i][j]
            -> element at row i, column j
    */

    System.out.println(
        "Rows = " + jagged.length
    );

    for (int i = 0; i < jagged.length; i++) {

        System.out.println(
            "Row " + i +
            " length = " +
            jagged[i].length
        );

    }


    // =====================================================================
    // GPT ADDITION 16 : TIME AND SPACE COMPLEXITY
    // =====================================================================

    System.out.println("\n\n========== GPT ADDITION 16 : COMPLEXITY ==========");

    /*
        Suppose:

        R = number of rows
        C = number of columns


        Complete traversal:

        for each row
            for each column

        Time Complexity:

        O(R * C)


        For a square matrix:

        n x n

        Time Complexity:

        O(n²)


        If we only traverse the array:

        Extra Space = O(1)


        If we create another matrix:

        Extra Space = O(R * C)
    */

    System.out.println(
        "Complete 2D array traversal = O(rows * columns)"
    );


    // =====================================================================
    // GPT ADDITION 17 : BASIC DSA PATTERN
    // =====================================================================

    System.out.println("\n\n========== GPT ADDITION 17 : DSA PATTERN ==========");

    /*
        Whenever you get a 2D array problem,
        first understand these three things.


        1.

        arr.length

        means:

        NUMBER OF ROWS


        2.

        arr[i].length

        means:

        NUMBER OF ELEMENTS IN ROW i


        3.

        arr[i][j]

        means:

        ELEMENT AT ROW i, COLUMN j


        Most 2D-array problems begin with:

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                // work with arr[i][j]

            }

        }
    */

    System.out.println(
        "Remember: arr[i][j] = row i, column j"
    );


    // =====================================================================
    // GPT ADDITION 18 : FINAL REVISION
    // =====================================================================

    System.out.println("\n\n========== GPT ADDITION 18 : FINAL REVISION ==========");

    System.out.println(
        """
        
        2D ARRAY

        int[][] arr = new int[3][3];


        DIRECT INITIALIZATION

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };


        ACCESS

        arr[i][j]


        NUMBER OF ROWS

        arr.length


        NUMBER OF ELEMENTS IN ROW i

        arr[i].length


        UPDATE

        arr[i][j] = value;


        SEARCH

        if (arr[i][j] == target)


        SUM

        sum += arr[i][j];


        MAX

        if (arr[i][j] > max)


        MIN

        if (arr[i][j] < min)


        MAIN DIAGONAL

        arr[i][i]


        SECONDARY DIAGONAL

        arr[i][n - 1 - i]


        SWAP

        int temp = arr[i][j];
        arr[i][j] = arr[x][y];
        arr[x][y] = temp;


        TRANSPOSE

        transpose[j][i] = arr[i][j];


        1D ARRAY PRINT

        Arrays.toString(arr)


        2D ARRAY PRINT

        Arrays.deepToString(arr)


        JAGGED ARRAY

        arr[i].length can be different for every row.


        COMPLETE TRAVERSAL

        O(rows * columns)

        """
    );


    // =====================================================================
    // END OF GPT ADDITIONS
    // =====================================================================

                          
  } 
} 
