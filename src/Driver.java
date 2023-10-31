import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userInput;
        do {
            System.out.println("Enter the first number: ");
            int num1 = keyboard.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = keyboard.nextInt();
            System.out.println("Enter the operation: (+,-,*,/)");
            String operation = keyboard.next();

            if (operation.equalsIgnoreCase("+")) {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            } else if (operation.equalsIgnoreCase("-")) {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            } else if (operation.equalsIgnoreCase("*")) {
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
            } else if (operation.equalsIgnoreCase("/")) {
                System.out.print(num1 + " / " + num2 + " = ");
                System.out.printf("%.2f\n", ((double) num1 / num2));
            } else {
                System.exit(0);
            }
            System.out.println("Do you want to retry?");
            userInput = keyboard.next();
        } while (userInput.equalsIgnoreCase("yes"));
    }
}
