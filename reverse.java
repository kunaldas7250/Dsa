import java.util.Scanner;

class reverse {
    public static void main(String args[]) {
        System.out.println("enter the number of elements");
        Scanner pc = new Scanner(System.in);
        int a = pc.nextInt();
        int[] array = new int[a];

        // Input the elements of the array
        for (int i = 0; i < a; i++) {
            array[i] = pc.nextInt();
        }

        // Reverse the array
        for (int i = 0; i < a / 2; i++) {
            int temp = array[i];
            array[i] = array[a - i - 1];
            array[a - i - 1] = temp;
        }

        // Print the reversed array
        for (int i = 0; i < a; i++) {
            System.out.print(array[i] + " ");
        }
    }
}