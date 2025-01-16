package Pretest;

import javax.swing.JOptionPane;

public class test2 {
    
    public static void main(String[] args) {
        String saraly;
        int numsaraly , rate;

        saraly = JOptionPane.showInputDialog("Enter monthly saraly (0 to quit):");
        numsaraly = Integer.parseInt(saraly);

        String output = "Anual Income : " + (numsaraly * 12);
        JOptionPane.showMessageDialog(null, output, "Message", JOptionPane.QUESTION_MESSAGE);

        if (numsaraly >= 150000) {
            rate = 0;
        } else if (numsaraly >= 30000) {
            rate = 5;
        }


    }
}
