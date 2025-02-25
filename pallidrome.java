

import java.util.Scanner;

public class pallidrome {
    public static boolean reversepallidrome(int i, String userName, int n) {
        if (i == n / 2) {
            return true;
        }
        if (userName.charAt(i) != userName.charAt(n - i - 1)) {
            return false;
        }
        return reversepallidrome(i + 1, userName, n);
    }

    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);
        int n = userName.length();
        System.out.println(n);
        System.out.println(reversepallidrome(0, userName, n));
    }
}