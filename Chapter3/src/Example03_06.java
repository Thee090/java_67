import java.util.Scanner;

public class Example03_06 {
    
    public static void main(String[] args) {
        int score;
        String grade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program Calculator.");
        System.out.print("Enter score : ");
        score = scanner.nextInt();
        switch (score / 10) {
            case 10:
            case 9:
            case 8:
                grade = "A";
                break;
            case 7:
                grade = "B";
                break;
            case 6:
                grade = "C";
            case 5:
                grade = "D";
                break;
            default:
                grade = "F";
        }
        System.out.println("Student get grade : " + grade);
        scanner.close();
    }
}
