import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();

        
        System.out.print("Enter a decimal number: ");
        double userDouble = scanner.nextDouble();
        scanner.nextLine();

        
        System.out.print("Enter a word or sentence: ");
        String userString = scanner.nextLine();

        
        System.out.println("Your integer: " + userInt);
        System.out.printf("Your decimal number: %.2f\n", userDouble);
        System.out.println("Your string: " + userString);

        
        scanner.close();
    }
}
