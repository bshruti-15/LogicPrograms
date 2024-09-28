import java.util.Scanner;

public class NaturalNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        int sum = 0;
        int i = 1;

        while (i <= N) {
            sum += i;
            i++;
        }

        System.out.println("The sum of the first " + N + " natural numbers is: " + sum);

        scanner.close();
    }
}
