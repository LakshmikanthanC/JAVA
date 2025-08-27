import java.util.*;

public class kthelementof2sortedarrays {
    public static void main(String[] args) {
        int arr1[] = {2, 3, 6, 7, 9};
        int arr2[] = {1, 4, 8, 10};
        int k = 5;

        int i = 0, j = 0, count = 0;
        int m = arr1.length, n = arr2.length;
        int kthElement = -1;

        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                count++;
                if (count == k) {
                    kthElement = arr1[i];
                    break;
                }
                i++;
            } else {
                count++;
                if (count == k) {
                    kthElement = arr2[j];
                    break;
                }
                j++;
            }
        }

        while (i < m && count < k) {
            count++;
            if (count == k) {
                kthElement = arr1[i];
                break;
            }
            i++;
        }

        while (j < n && count < k) {
            count++;
            if (count == k) {
                kthElement = arr2[j];
                break;
            }
            j++;
        }

        System.out.println("The " + k + "th element is: " + kthElement);
    }
}

// The 5th element is: 6