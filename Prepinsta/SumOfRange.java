import java.util.Scanner;

public class SumOfRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("The sum of the numbers from " + start + " to " + end + " is: " + sum);

        scanner.close();
    }
}
