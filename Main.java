// Main.java

public class Main {
    public static void main(String[] args) {
        UserInput in = new UserInput();
        ArrayFunctions functions = new ArrayFunctions();
        
        int[] userArray = in.arrayInput();
        
        System.out.println("--- Even and Odd Separation ---");
        functions.oddEven(userArray);
        
        System.out.println("\n--- Smallest Distance Between Neighbors ---");
        int index = functions.findSmallestDistance(userArray);
        System.out.println("Index of first number with smallest distance: " + index);
        
        System.out.println("\n--- Array to ArrayList and Vice Versa ---");
        functions.convertArrayAndList(userArray);
    }
}