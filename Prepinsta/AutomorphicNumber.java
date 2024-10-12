import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (isAutomorphic(number)) {
            System.out.println(number + " is an automorphic number.");
        } else {
            System.out.println(number + " is not an automorphic number.");
        }
        
        scanner.close();
    }

    public static boolean isAutomorphic(int num) {
      
        int square = num * num;
		
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
		
        return squareStr.endsWith(numStr);
    }
}
