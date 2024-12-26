import java.text.DecimalFormat;
import java.util.Scanner;

public class Example03_09 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PER_LINE = 5;
        int first, second;
        System.out.print("Enter first number : ");
        first = scanner.nextInt();
        System.out.print("Enter second number : ");
        second = scanner.nextInt();
        int sum, count;
        sum = count = 0;

    for (int num = first; num <= second; num += 1) {
        sum += num;
        count++;
        if (count % PER_LINE == 0)
            System.out.println("\t" + num);
        else 
            System.out.print("\t" + num);
    }
    System.out.println();
    DecimalFormat twoDigit = new DecimalFormat("0.00");
    System.out.println("Summation of " + first + "to" + second + " = " + sum);
    float average = (float) sum / count;
    System.out.println("Average : " + twoDigit.format(average));
    scanner.close();
    }
}
