import java.util.Scanner;

class MaxMin {
    public static void main(String args[]) {
        System.out.println("Enter the number of elements in the array:");
        Scanner pc = new Scanner(System.in);
        int a = pc.nextInt();
        int[] array = new int[a];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a; i++) {
            array[i] = pc.nextInt();
        }

        int max = array[0];
        int min = array[0];

        for (int i = 1; i < a; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Maximum element of the array: " + max);
        System.out.println("Minimum element of the array: " + min);
    }
}