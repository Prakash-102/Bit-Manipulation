
// Get ith Bit ?:- 
import java.util.*;

public class getithBit {

    public static int getIthBit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
    }
}
/*
 * Output:-
 * 0
 */
