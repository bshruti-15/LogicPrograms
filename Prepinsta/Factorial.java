import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        long factorial = 1; // Use long to accommodate large factorials
        
        // Calculate factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply each number from 1 to the input number
        }
        
        // Output the result
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
