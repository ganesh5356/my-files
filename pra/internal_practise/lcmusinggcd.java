package internal_practise;

import java.util.Scanner;

public class lcmusinggcd {

    // Function to compute GCD using Euclidean algorithm
    static int gcd(int a, int b) {
        if (b==0)return a;
        return gcd(b,a % b);
    }

    // Function to compute LCM
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Calculate and display LCM
        int result = lcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + result);

        scanner.close();
    }
}
