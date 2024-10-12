import java.util.Scanner;

public class AmicableNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first positive integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second positive integer: ");
        int num2 = scanner.nextInt();

        if (areAmicable(num1, num2)) {
            System.out.println(num1 + " and " + num2 + " are amicable numbers.");
        } else {
            System.out.println(num1 + " and " + num2 + " are not amicable numbers.");
        }

        scanner.close();
    }

    public static boolean areAmicable(int a, int b) {
        return (sumOfDivisors(a) == b) && (sumOfDivisors(b) == a);
    }

    public static int sumOfDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum;
    }
}
