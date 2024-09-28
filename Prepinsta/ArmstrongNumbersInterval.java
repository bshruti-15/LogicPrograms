import java.util.Scanner;

public class ArmstrongNumbersInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("Enter the starting number of the interval: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the ending number of the interval: ");
        int end = scanner.nextInt();
        
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
 
        for (int number = start; number <= end; number++) {
            if (isArmstrong(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10; 
            sum += Math.pow(digit, digits);
            number /= 10; 
        }
    
        return sum == originalNumber;
    }
}
