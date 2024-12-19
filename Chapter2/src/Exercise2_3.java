import java.util.Scanner;

public class Exercise2_3 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        float printcipal, rate;

        System.out.print("Enter printcipal : ");
        printcipal = scanner.nextFloat();
        System.out.print("Enter interest rate : ");
        rate = scanner.nextFloat();
        // year 1
        float interest, deposit, printcipal_cal;
        // year 1
        printcipal_cal = printcipal;
        interest = printcipal * (rate / 100);
        deposit = printcipal_cal + interest; 

        
        // year 2
        printcipal_cal = deposit;
        interest = printcipal * (rate / 100);
        deposit = printcipal_cal + interest;

         // year 3
         printcipal_cal = deposit;
         interest = printcipal * (rate / 100);
         deposit = printcipal_cal + interest;

         // year 4
         printcipal_cal = deposit;
         interest = printcipal * (rate / 100);
         deposit = printcipal_cal + interest;

         System.out.println("Principle = " + printcipal);
         System.out.println("Interest rate = " + rate + "%");
         System.out.println("Interest = " + (deposit - printcipal));
         System.out.println();
         scanner.close();
        
    }
}
