import java.util.Scanner;

public class Exaple03_05 {
    
    public static void main(String[] args) {
        int num, numOld;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 4 digit number : ");
        num = scanner.nextInt();
        numOld = num;

        int count = 0;
        if (num > 0) {
            count++;
            num = num / 10;
            if (num > 0) {
                count++;
                num = num / 10;
                if (num > 0) {
                    count++;
                    num = num / 10;
                    if (num > 0) {
                        count++;
                        num = num / 10;
                    }
                }
            }
        }
        if (num == 0 && count == 4)
            System.out.println("Number " + numOld + " is 4 digits.");
        else
            System.out.println("Number " + numOld + " is not equal 4 digits.");
    }
}
