import java.util.*;

public class Main {
    static void leftRotate(int arr[], int n, int d) {

        if (n == 0) return;
        // Get the effective number of rotations:
        d = d % n;

        // checking if d is a multiple of n:
        if (d == 0) return;

        int[] temp = new int[d]; // temporary array

        //step 1: Copying first d elements
        // in the temporary array:
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // step 2: Shift last (n-d) elements
        // to the left by d places in the given array:
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        //step 3: Place the elements of the temporary
        // array in the last d places of the given array:
        for (int i = n - d; i < n; i++) {
            arr[i] = temp[i - (n - d)];
        }
    }
    public static void main(String args[]) {
        int n = 7;
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        System.out.println("Before rotation:");
        for (int i = 0; i < n; i++)
            System.out.print( arr[i] + " ");
        System.out.println();

        leftRotate(arr, n, d);
        System.out.println("After rotation:");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}