
import java.util.Scanner;

public class reverse_recursion {
   public static void reverse(int i, int arr[], int size) {
        if (i >= size / 2) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[size - i - 1];
        arr[size - i - 1] = temp;
        reverse(i + 1, arr, size);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of array elements: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            System.out.println("Element " + (i + 1) + ": " + arr[i]);
        }

        //reverse_recursion reverser = new reverse_recursion();
        reverse(0, arr, size);

        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + arr[i]);
        }
    }
}