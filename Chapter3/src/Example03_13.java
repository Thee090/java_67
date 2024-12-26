import java.text.DecimalFormat;
import java.util.Scanner;

public class Example03_13 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat twoDigits = new DecimalFormat("0.00");

        int count = 1;
        double value = 0.0, total = 0.0;

        System.out.println(">> Exit input enter -1 <<");

    while (value > -1.0) {
        System.out.print("Enter floating-point number #");
        System.out.print(count + " : ");
        value = scanner.nextDouble();
        if (value != -1.00) {
            total += value;
            count++;
        }
    }
    double average = total / count;
    System.out.print("Total value : ");
    System.out.println(twoDigits.format(total));
    System.out.print("Average value : ");
    System.out.println(twoDigits.format(average));
    scanner.close();
    }
}
