import java.util.Scanner;

public class SimplePrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number of the range: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the ending number of the range: ");
        int end = scanner.nextInt();
        
        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) return false; 
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false; 
        }
        return true; 
    }
}
