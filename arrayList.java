
import java.util.*;

public class arrayList {

    public static void main(String[] args) {

        // ============================================================
        // PART 1: 2D JAGGED ARRAY
        // ============================================================

        System.out.println("==================================================");
        System.out.println("PART 1: JAGGED 2D ARRAY");
        System.out.println("==================================================");

        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6},
            {7, 8, 9}
        };

        System.out.println("\nPrinting Jagged Array:");

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                System.out.print(arr[row][col] + " ");

            }

            System.out.println();
        }

        System.out.println("\nNumber of rows: " + arr.length);

        for (int row = 0; row < arr.length; row++) {
            System.out.println(
                "Row " + row + " has " + arr[row].length + " elements"
            );
        }


        // ============================================================
        // PART 2: ARRAYLIST CREATION
        // ============================================================

        System.out.println("\n\n==================================================");
        System.out.println("PART 2: ARRAYLIST");
        System.out.println("==================================================");

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("\nInitial ArrayList:");
        System.out.println(list);


        // ============================================================
        // 1. add()
        // ============================================================

        System.out.println("\n--- 1. add() ---");

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("After adding 10, 20, 30:");
        System.out.println(list);


        // ============================================================
        // 2. add(index, value)
        // ============================================================

        System.out.println("\n--- 2. add(index, value) ---");

        list.add(1, 50);

        System.out.println("Added 50 at index 1:");
        System.out.println(list);

        /*
            Before:

            Index:  0   1   2
            Value: 10  20  30

            list.add(1, 50)

            After:

            Index:  0   1   2   3
            Value: 10  50  20  30
        */


        // ============================================================
        // 3. get()
        // ============================================================

        System.out.println("\n--- 3. get() ---");

        int value = list.get(2);

        System.out.println("Element at index 2: " + value);


        // ============================================================
        // 4. set()
        // ============================================================

        System.out.println("\n--- 4. set() ---");

        System.out.println("Before set(): " + list);

        list.set(2, 100);

        System.out.println("After list.set(2, 100):");
        System.out.println(list);


        // ============================================================
        // 5. size()
        // ============================================================

        System.out.println("\n--- 5. size() ---");

        System.out.println("ArrayList size: " + list.size());


        // ============================================================
        // 6. contains()
        // ============================================================

        System.out.println("\n--- 6. contains() ---");

        System.out.println("Does list contain 100?");
        System.out.println(list.contains(100));

        System.out.println("Does list contain 500?");
        System.out.println(list.contains(500));


        // ============================================================
        // 7. indexOf()
        // ============================================================

        System.out.println("\n--- 7. indexOf() ---");

        System.out.println("Index of 100: " + list.indexOf(100));

        System.out.println("Index of 500: " + list.indexOf(500));


        // ============================================================
        // 8. lastIndexOf()
        // ============================================================

        System.out.println("\n--- 8. lastIndexOf() ---");

        list.add(100);

        System.out.println("Current list:");
        System.out.println(list);

        System.out.println("Last index of 100: " + list.lastIndexOf(100));


        // ============================================================
        // 9. remove(index)
        // ============================================================

        System.out.println("\n--- 9. remove(index) ---");

        System.out.println("Before removing index 2:");
        System.out.println(list);

        list.remove(2);

        System.out.println("After removing index 2:");
        System.out.println(list);


        // ============================================================
        // 10. remove(object)
        // ============================================================

        System.out.println("\n--- 10. remove(object) ---");

        list.add(50);
        list.add(50);

        System.out.println("Before removing value 50:");
        System.out.println(list);

        list.remove(Integer.valueOf(50));

        System.out.println("After removing one value 50:");
        System.out.println(list);

        /*
            IMPORTANT:

            list.remove(1)

            means:
            Remove element at INDEX 1.

            list.remove(Integer.valueOf(1))

            means:
            Remove the VALUE 1.
        */


        // ============================================================
        // 11. isEmpty()
        // ============================================================

        System.out.println("\n--- 11. isEmpty() ---");

        System.out.println("Is list empty?");
        System.out.println(list.isEmpty());


        // ============================================================
        // 12. FOR LOOP
        // ============================================================

        System.out.println("\n--- 12. Normal FOR Loop ---");

        for (int i = 0; i < list.size(); i++) {

            System.out.println(
                "Index " + i + " = " + list.get(i)
            );
        }


        // ============================================================
        // 13. FOR-EACH LOOP
        // ============================================================

        System.out.println("\n--- 13. FOR-EACH Loop ---");

        for (int x : list) {

            System.out.println(x);

        }


        // ============================================================
        // PART 3: SORTING
        // ============================================================

        System.out.println("\n\n==================================================");
        System.out.println("PART 3: SORTING");
        System.out.println("==================================================");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(50);
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(30);

        System.out.println("\nOriginal:");
        System.out.println(numbers);


        // ============================================================
        // 14. Collections.sort()
        // ============================================================

        System.out.println("\n--- 14. Collections.sort() ---");

        Collections.sort(numbers);

        System.out.println("Ascending order:");
        System.out.println(numbers);


        // ============================================================
        // 15. reverseOrder()
        // ============================================================

        System.out.println("\n--- 15. reverseOrder() ---");

        Collections.sort(numbers, Collections.reverseOrder());

        System.out.println("Descending order:");
        System.out.println(numbers);


        // ============================================================
        // 16. Collections.reverse()
        // ============================================================

        System.out.println("\n--- 16. Collections.reverse() ---");

        Collections.reverse(numbers);

        System.out.println("After reverse:");
        System.out.println(numbers);


        // ============================================================
        // PART 4: ADDALL
        // ============================================================

        System.out.println("\n\n==================================================");
        System.out.println("PART 4: addAll()");
        System.out.println("==================================================");

        ArrayList<Integer> first = new ArrayList<>();

        first.add(10);
        first.add(20);

        ArrayList<Integer> second = new ArrayList<>();

        second.add(30);
        second.add(40);

        System.out.println("First list:");
        System.out.println(first);

        System.out.println("Second list:");
        System.out.println(second);

        first.addAll(second);

        System.out.println("After first.addAll(second):");
        System.out.println(first);


        // ============================================================
        // PART 5: removeAll
        // ============================================================

        System.out.println("\n\n==================================================");
        System.out.println("PART 5: removeAll()");
        System.out.println("==================================================");

        ArrayList<Integer> removeExample = new ArrayList<>();

        removeExample.add(10);
        removeExample.add(20);
        removeExample.add(30);
        removeExample.add(40);
        removeExample.add(20);

        ArrayList<Integer> removeValues = new ArrayList<>();

        removeValues.add(20);
        removeValues.add(40);

        System.out.println("Original list:");
        System.out.println(removeExample);

        removeExample.removeAll(removeValues);

        System.out.println("After removeAll([20, 40]):");
        System.out.println(removeExample);


        // ============================================================
        // PART 6: SWAP USING TEMPORARY VARIABLE
        // ============================================================

        System.out.println("\n\n==================================================");
        System.out.println("PART 6: SWAP USING TEMPORARY VARIABLE");
        System.out.println("==================================================");

        int a = 10;
        int b = 20;

        System.out.println("\nBefore swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;

        a = b;

        b = temp;

        System.out.println("\nAfter swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        // ============================================================
        // PART 7: SWAP ARRAY ELEMENTS
        // ============================================================

        System.out.println("\n\n==================================================");
        System.out.println("PART 7: SWAP ARRAY ELEMENTS");
        System.out.println("==================================================");

        int[] swapArray = {10, 20, 30, 40};

        System.out.println("\nBefore swap:");
        System.out.println(Arrays.toString(swapArray));

        /*
            We want to swap:

            index 1 → 20
            index 3 → 40
        */

        int tempArray = swapArray[1];

        swapArray[1] = swapArray[3];

        swapArray[3] = tempArray;

        System.out.println("After swapping index 1 and index 3:");
        System.out.println(Arrays.toString(swapArray));


        // ============================================================
        // PART 8: SWAP ARRAYLIST ELEMENTS MANUALLY
        // ============================================================

        System.out.println("\n\n==================================================");
        System.out.println("PART 8: ARRAYLIST MANUAL SWAP");
        System.out.println("==================================================");

        ArrayList<Integer> swapList = new ArrayList<>();

        swapList.add(10);
        swapList.add(20);
        swapList.add(30);
        swapList.add(40);

        System.out.println("\nBefore swap:");
        System.out.println(swapList);

        /*
            We want:

            Index 1 → 20
            Index 3 → 40

            After swap:

            Index 1 → 40
            Index 3 → 20
        */

        int tempList = swapList.get(1);

        swapList.set(1, swapList.get(3));

        swapList.set(3, tempList);

        System.out.println("After manual swap:");
        System.out.println(swapList);


        // ============================================================
        // PART 9: SWAP ARRAYLIST USING Collections.swap()
        // ============================================================

        System.out.println("\n\n==================================================");
        System.out.println("PART 9: Collections.swap()");
        System.out.println("==================================================");

        ArrayList<Integer> collectionsSwap = new ArrayList<>();

        collectionsSwap.add(10);
        collectionsSwap.add(20);
        collectionsSwap.add(30);
        collectionsSwap.add(40);

        System.out.println("\nBefore swap:");
        System.out.println(collectionsSwap);

        Collections.swap(collectionsSwap, 1, 3);

        System.out.println("After Collections.swap(list, 1, 3):");
        System.out.println(collectionsSwap);


        // ============================================================
        // PART 10: SWAP WITHOUT TEMPORARY VARIABLE
        // ============================================================

        System.out.println("\n\n==================================================");
        System.out.println("PART 10: SWAP WITHOUT TEMP VARIABLE");
        System.out.println("==================================================");

        int x = 10;
        int y = 20;

        System.out.println("\nBefore swap:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("\nAfter swap:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);


        // ============================================================
        // PART 11: CLEAR
        // ============================================================

        System.out.println("\n\n==================================================");
        System.out.println("PART 11: clear()");
        System.out.println("==================================================");

        ArrayList<Integer> clearList = new ArrayList<>();

        clearList.add(10);
        clearList.add(20);
        clearList.add(30);

        System.out.println("Before clear:");
        System.out.println(clearList);

        clearList.clear();

        System.out.println("After clear:");
        System.out.println(clearList);

        System.out.println("Is empty?");
        System.out.println(clearList.isEmpty());


        // ============================================================
        // FINAL SUMMARY
        // ============================================================

        System.out.println("\n\n==================================================");
        System.out.println("FINAL QUICK REVISION");
        System.out.println("==================================================");

        System.out.println("""
        
        ARRAY:
        
        arr.length
        arr[index]
        arr[index] = value
        
        
        ARRAYLIST: ArrayList<Integer> collectionsSwap = new ArrayList<>();
        
        list.add(value)
        list.add(index, value)
        list.get(index)
        list.set(index, value)
        list.remove(index)
        list.remove(Integer.valueOf(value))
        list.size()
        list.contains(value)
        list.isEmpty()
        list.indexOf(value)
        list.lastIndexOf(value)
        list.clear()
        list.addAll(otherList)
        list.removeAll(otherList)
        
        
        COLLECTIONS:
        
        Collections.sort(list)
        Collections.sort(list, Collections.reverseOrder())
        Collections.reverse(list)
        Collections.swap(list, i, j)
        
        
        SWAP:
        
        int temp = a;
        a = b;
        b = temp;
        
        
        JAGGED ARRAY:
        
        arr.length
        = number of rows
        
        arr[row].length
        = number of elements in that particular row
        
        """);

        System.out.println("==================================================");
        System.out.println("PROGRAM FINISHED");
        System.out.println("==================================================");
    }
}
