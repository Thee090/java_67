import java.util.Scanner;

public class Example03_02 {
    
    public static void main(String[] args) {
        final double PAYRATE = 12.25;
        double hour, wage;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hour worked : ");
        hour = scanner.nextDouble();
        if ((hour < 0) || (hour > 40.0)) 
            System.out.println("Input error.");
        else {
            wage = hour * PAYRATE;
            System.out.println("Wage pay : " + wage);
        }
        scanner.close();
    }
}
