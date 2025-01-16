package Pretest;

import java.util.Scanner;

public class test {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int count = 1, c = 1;
        int score = 0, credit = 0;

        while (score > 6) {
            System.out.print("Enter score of subject #");
            System.out.print(count + " : ");
            score = scanner.nextInt();
            System.out.print("Enter score of subject #");
            System.out.print(c + " : ");
            credit = scanner.nextInt();
        }
    }
}
