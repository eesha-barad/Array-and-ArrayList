// Main.java

import java.util.*;

public class Main {
    public static void main(String[] args) {
        UserInput in = new UserInput();
        ArrayFunctions functions = new ArrayFunctions();
        
        List<Integer> userList = in.arrayInput();
        
        System.out.println("--- Even and Odd Separation ---");
        functions.oddEven(userList);
        
        System.out.println("\n--- Smallest Distance Between Neighbors ---");
        int index = functions.findSmallestDistance(userList);
        System.out.println("Index of first number with smallest distance: " + index);
        
        System.out.println("\n--- Array to ArrayList and Vice Versa ---");
        functions.convertArrayAndList(userList);
    }
}
