
// Get ith Bit ?:- 
import java.util.*;

public class ClearithBit {

    public static int ClearIthBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(ClearIthBit(10, 1));
    }
}
/*
 * Output:-
 * 10
 */
