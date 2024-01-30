
// Update ith Bit ?:- 
import java.util.*;

public class Update {

    public static int ClearIthBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int SetIthBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int UpdateIthBit(int n, int i, int newBit) {
        n = ClearIthBit(n, i);
        int bitmask = newBit << i;
        return n | bitmask;
    }

    public static void main(String[] args) {
        System.out.println(UpdateIthBit(10, 2, 2));
    }
}
/*
 * Output:-
 * 14
 */
