/* 👉 Count how many times an element appears in an array.
  Example: [1,2,2,3,4,5]
  n=2
  Output: 2
  */
import java.util.*;
public class FrequencyOneElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 2, 4};
        int x = 2;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        System.out.println("Frequency of " + x + " is: " + count);
    }
}

    
