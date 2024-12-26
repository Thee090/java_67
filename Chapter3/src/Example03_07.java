import java.util.Scanner;

public class Example03_07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        double result = 0;
        boolean done = true;
        String message;
        System.out.print("Enter equation : ");
        num1 = scanner.nextInt();
        message = scanner.next();
        num2 = scanner.nextInt();
        char operator = message.charAt(0);

        switch (operator) {
            case '+':
                result = num1 + num2;
                message = "result = num1 + num2 = ";
                break;
            case '-':
                result = num1 - num2;
                message = "result = num1 - num2 = ";
                break;
            case '*':
                result = num1 * num2;
                message = "result = num1 * num2 = ";
                break;
            case '/':
                result = (double) num1 / num2;
                message = "result = num1 / num2 = ";
                break;
            case '%':
                result = num1 % num2;
                message = "result = num1 % num2 = ";
                break;
            default:
                done = false;

        }
        if (done)
            System.out.println(message + result);
        else
            System.out.println("Invalid Operator.");
        scanner.close();
    }
}