
// Check if Odd or Even ?:- 
import java.util.*;

public class OddorEven {

    public static void OddorEven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            // even number
            System.out.println("even number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        OddorEven(3);
        OddorEven(4);
        OddorEven(14);
    }
}
/*
 * Output:-
 * Odd Number
 * even number
 * even number
 */
