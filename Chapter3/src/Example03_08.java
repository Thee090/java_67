import java.text.NumberFormat;
import java.util.Scanner;

public class Example03_08 {
    
    public static void main(String[] args) {
        final int NUM_GMAES = 12;
        int won;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of games won(0 to" + NUM_GMAES + " ) : "  );
        won = scanner.nextInt();

        while (won < 0 || won > NUM_GMAES) {
            System.out.print("Invalid input. Please reenter : ");
            won = scanner.nextInt();
        }
        float ration = (float) won / NUM_GMAES;
        NumberFormat fmt = NumberFormat.getPercentInstance();
        System.out.println();
        System.out.println("Winnig percentage : " + fmt.format(ration));
        scanner.close();
    }

}
