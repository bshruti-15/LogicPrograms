import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (isHarshad(number)) {
            System.out.println(number + " is a Harshad number.");
        } else {
            System.out.println(number + " is not a Harshad number.");
        }

        scanner.close();
    }

    public static boolean isHarshad(int num) {
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            sum += temp % 10; 
            temp /= 10;   
        }
        return num % sum == 0;
    }
}
