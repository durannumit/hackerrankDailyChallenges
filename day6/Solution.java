import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        in.nextLine();
        
        for (int i = 0; i < number; i++) {
            String string = in.nextLine();
            char[] array = string.toCharArray();

            for (int k = 0; k < array.length; k++) {
                if (k % 2 == 0) {
                    System.out.print(array[k]);
                }
            }
            System.out.print(" ");
            
         for (int j = 0; j < array.length; j++) {
                if (j % 2 != 0) {
                    System.out.print(array[j]);
                }
            }
                System.out.println();
        }
            
    }
}