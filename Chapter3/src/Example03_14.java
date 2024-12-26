import java.text.DecimalFormat;
import java.util.Scanner;

public class Example03_14 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat fourDigit = new DecimalFormat("0.0000");
        String strMenu = "";
        int choice;
        boolean done = true;

        strMenu += "    Main Menu\n" + "==============\n";
        strMenu += "1. Area Ractangle\n2. Area Circle\n";
        strMenu += "3. Exit\nEmter Choice : ";

        do{
            System.out.print(strMenu);
            choice = scanner.nextInt();
            if (choice == 1) {
                float width, height, area;
                System.out.print("Enter width : ");
                width = scanner.nextFloat();
                System.out.print("Enter hright : ");
                height = scanner.nextFloat();
                area = width * height;
                System.out.print("Area of Ractangle = ");
                System.out.println(fourDigit.format(area));
            } else if (choice == 2) {
                float radius, area;
                System.out.print("Enter radius : ");
                radius = scanner.nextFloat();
                area = (float) (Math.PI * radius * radius);
                System.out.print("Area of Cicle = ");
                System.out.println(fourDigit.format(area));
            } else if (choice == 3) {
                done = false;
            } else {
                System.out.println("This choices is incorract, ");
                System.out.println("Try again.");
            }
            System.out.println();
        } while (done) ;
        System.out.println("Exit Program, Bye.");
        scanner.close();
    }
}
