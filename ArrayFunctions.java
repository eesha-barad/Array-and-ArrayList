// ArrayFunctions.java

import java.util.*;
import java.util.Arrays;

public class ArrayFunctions {
    public void display(int[] array, String type) {
        System.out.println(type + " numbers: " + Arrays.toString(array));
    }
	
	public void oddEven(int[] array) {
        int evenCount = 0, oddCount = 0;
        
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];
        evenCount = 0;
        oddCount = 0;
        
        for (int num : array) {
            if (num % 2 == 0) {
                even[evenCount++] = num;
            } else {
                odd[oddCount++] = num;
            }
        }
        
        display(even, "Even");
        display(odd, "Odd");
    }
	
	public int findSmallestDistance(int[] array) {
        if (array.length < 2) {
            return -1;
        }
        
        int minIndex = 0;
        int minDistance = Math.abs(array[1] - array[0]);
        
        for (int i = 1; i < array.length - 1; i++) {
            int distance = Math.abs(array[i + 1] - array[i]);
            if (distance < minDistance) {
                minDistance = distance;
                minIndex = i;
            }
        }
        return minIndex;
    }
}