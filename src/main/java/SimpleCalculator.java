import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to simple calculator");
        System.out.println("Input first number: ");
        double number1 = scanner.nextDouble();

        System.out.println("Input second number");
        double number2 = scanner.nextDouble();

        System.out.println("Choose operation: ");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        System.out.println("Enter the operation number: ");
        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 1 :
                result = number1 + number2;
            case 2:
                result = number1 - number2;
            case 3:
                result = number1 * number2;
            case 4:
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation choice");
                return;
        }
        System.out.println("Result: " + result);
    }
}
