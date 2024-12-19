import java.util.Scanner;

public class Example02_12 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour;
        float rate, wage;

        System.out.print("Enter hour work : ");
        hour = scanner.nextInt();
        System.out.print("Enter hourly rate : ");
        rate = scanner.nextFloat();
        wage = (hour <= 40) ? (hour * rate) : ((40 * rate) + ((hour - 40) * 1.5f * rate ));
        System.out.println("Employee get wage : " + wage);
    }
}
