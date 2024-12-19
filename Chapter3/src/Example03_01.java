import java.util.Scanner;

public class Example03_01 {
    
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        name = scanner.nextLine();
        if (name.equals("Java") )  {
            System.out.println("Hello, " + name);
        }
        System.out.println("Good bye, " + name);
        scanner.close();
    }
}
