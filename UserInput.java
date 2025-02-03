//UserInput.java

import java.util.*;

public class UserInput {
    List<Integer> arrayInput() {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter 5 numbers: ");
        
        for (int i = 0; i < 5; i++) {
            list.add(scan.nextInt());
        }
        return list;
    }
}
