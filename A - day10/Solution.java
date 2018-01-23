import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        int temp = 0;
        int ones = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                temp++;
                if (temp > ones) {
                    ones = temp;
                }
            } else {
                temp = 0;
            }
            
            n = n / 2;
        }
        System.out.println(ones);
    }
}