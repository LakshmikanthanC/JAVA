import java.util.*;
class two_arrays_are_equal_or_not {
    static boolean checkEqual(int[] a, int[] b) {
      
        // If lengths of array are not equal means
        // array are not equal
        if (a.length != b.length) return false;
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i])
                return false;

        // If all elements were same.
        return true;
    }

    public static void main(String[] args) {
        int[] a = { 3, 5, 2, 5, 2 };
        int[] b = { 2, 3, 5, 5, 2 };
        if (checkEqual(a, b))
            System.out.println("true");
        else
            System.out.println("false");
    }
}

// true
