package Pretest;

import java.util.Scanner;

public class test1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("+-------------------------+");
        System.out.println("| Program Calculate Grade |");
        System.out.println("+-------------------------+");

        System.out.println("Input Data:");
        System.out.print("Enter score of subject #1 : ");
        int sub1 = scanner.nextInt();
        System.out.print("Enter credit of subject #1 :");
        int credit1 = scanner.nextInt();
        System.out.print("Enter score of subject #2 : ");
        int sub2 = scanner.nextInt();
        System.out.print("Enter credit of subject #2 :");
        int credit2 = scanner.nextInt();
        System.out.print("Enter score of subject #3 : ");
        int sub3 = scanner.nextInt();
        System.out.print("Enter credit of subject #3 :");
        int credit3 = scanner.nextInt();
        System.out.print("Enter score of subject #4 : ");
        int sub4 = scanner.nextInt();
        System.out.print("Enter credit of subject #4 :");
        int credit4 = scanner.nextInt();
        System.out.print("Enter score of subject #5 : ");
        int sub5 = scanner.nextInt();
        System.out.print("Enter credit of subject #5 :");
        int credit5 = scanner.nextInt();
        System.out.print("Enter score of subject #6 : ");
        int sub6 = scanner.nextInt();
        System.out.print("Enter credit of subject #6 :");
        int credit6 = scanner.nextInt();

       

        System.out.println("\tGrade Data Report");
        System.out.println("==================================");
        System.out.println("|No.| Score |Grade|Credit| Points|");
        System.out.println("==================================");
        System.out.println("| 1 |"+sub1+"|    |"+credit1+"|    |");
        System.out.println("| 2 |"+sub2+"|    |"+credit2+"|    |");
        System.out.println("| 3 |"+sub3+"|    |"+credit3+"|    |");
        System.out.println("| 4 |"+sub4+"|    |"+credit4+"|    |");
        System.out.println("| 5 |"+sub5+"|    |"+credit5+"|    |");
        System.out.println("| 6 |"+sub6+"|    |"+credit6+"|    |");
    }
}
