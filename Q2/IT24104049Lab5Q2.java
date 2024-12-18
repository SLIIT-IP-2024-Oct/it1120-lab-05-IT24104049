import java.util.Scanner;

public class IT24104049Lab5Q2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of new members
        System.out.print("Enter the number of new members introduced: ");
        int newMembers = scanner.nextInt();

        // Validate input
        while (newMembers < 0) {
            System.out.print("Invalid input. Number of new members cannot be negative. Try again: ");
            newMembers = scanner.nextInt();
        }

        // Determine prize using switch statement
        String prize;
        switch (newMembers) {
            case 0:
                prize = "No Prize";
                break;
            case 1:
                prize = "Pen";
                break;
            case 2:
                prize = "Umbrella";
                break;
            case 3:
                prize = "Bag";
                break;
            case 4:
                prize = "Travelling Chair";
                break;
            default:
                prize = "Headphone";
                break;
        }

        // Output: Display prize
        System.out.println("The prize you are entitled to: " + prize);

        scanner.close();
    }
}
