import java.util.Scanner;

public class IT24104049Lab5Q1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        int smallest, largest;

        // Find the smallest number
        smallest = Math.min(Math.min(num1, num2), num3);

        // Find the largest number
        largest = Math.max(Math.max(num1, num2), num3);

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);

        scanner.close();
    }
}