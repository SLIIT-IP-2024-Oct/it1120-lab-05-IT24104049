import java.util.Scanner;

public class IT24104049Lab5Q3{
    // Constants for fixed values
    public static final int ROOM_CHARGE_PER_DAY = 48000;
    public static final int DISCOUNT_3_4_DAYS = 10;   // 10% discount
    public static final int DISCOUNT_5_OR_MORE = 20;  // 20% discount

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startDate, endDate;

        // Input and validate start date
        System.out.print("Enter the start date of the reservation (1-31): ");
        startDate = scanner.nextInt();
        while (startDate < 1 || startDate > 31) {
            System.out.print("Invalid input. Start date must be between 1 and 31. Try again: ");
            startDate = scanner.nextInt();
        }

        // Input and validate end date
        System.out.print("Enter the end date of the reservation (1-31): ");
        endDate = scanner.nextInt();
        while (endDate < 1 || endDate > 31) {
            System.out.print("Invalid input. End date must be between 1 and 31. Try again: ");
            endDate = scanner.nextInt();
        }

        // Validate start date is less than end date
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than the end date.");
            return; // Exit the program
        }

        // Calculate the number of days reserved
        int daysReserved = endDate - startDate;
        System.out.println("Number of days reserved: " + daysReserved);

        // Calculate total amount with discount
        double totalAmount = ROOM_CHARGE_PER_DAY * daysReserved;
        double discount = 0;

        if (daysReserved >= 3 && daysReserved <= 4) {
            discount = totalAmount * DISCOUNT_3_4_DAYS / 100.0;
        } else if (daysReserved >= 5) {
            discount = totalAmount * DISCOUNT_5_OR_MORE / 100.0;
        }

        double amountToPay = totalAmount - discount;

        // Display the results
        System.out.printf("Total room charges before discount: Rs %.2f\n", totalAmount);
        System.out.printf("Discount applied: Rs %.2f\n", discount);
        System.out.printf("Total amount to be paid: Rs %.2f\n", amountToPay);

        scanner.close();
    }
}
