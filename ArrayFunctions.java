// ArrayFunctions.java

import java.util.*;

class ArrayFunctions {
    public void display(List<Integer> list, String type) {
        System.out.println(type + " numbers: " + list);
    }
    
	// Function to separate odd and even numbers
    public void oddEven(List<Integer> list) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        
        for (int num : list) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }
        
        display(even, "Even");
        display(odd, "Odd");
    }
    
	// Function to find the smallest distance
    public int findSmallestDistance(List<Integer> list) {
        if (list.size() < 2) {
            return -1;
        }
        
        int minIndex = 0;
        int minDistance = Math.abs(list.get(1) - list.get(0));
        
        for (int i = 1; i < list.size() - 1; i++) {
            int distance = Math.abs(list.get(i + 1) - list.get(i));
            if (distance < minDistance) {
                minDistance = distance;
                minIndex = i;
            }
        }
        return minIndex;
    }
    
	// Function to convert array to array list and vice versa
    public void convertArrayAndList(List<Integer> list) {
        // Convert ArrayList to Array
        Integer[] array = list.toArray(new Integer[0]);
        System.out.println("ArrayList converted to Array: " + Arrays.toString(array));
        
        // Convert Array back to ArrayList
        List<Integer> newList = new ArrayList<>(Arrays.asList(array));
        System.out.println("Array converted back to ArrayList: " + newList);
    }
}
