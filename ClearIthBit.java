
// Clear range of bits ?:- 
import java.util.*;

public class ClearIthBit {

    public static int ClearIthBit(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitmask = a / b;
        return n & bitmask;
    }

    public static void main(String[] args) {
        System.out.println(ClearIthBit(10, 2, 4));
    }
}
/*
 * Output:-
 * 2
 */
