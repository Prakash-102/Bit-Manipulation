
// Get ith Bit ?:- 
import java.util.*;

public class SetithBit {

    public static int SetIthBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(SetIthBit(10, 2));
    }
}
/*
 * Output:-
 * 14
 */
