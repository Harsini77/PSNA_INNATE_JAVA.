import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();  

            if (n == -1) break;    

            sum += n;
            count++;

            if (n > max) max = n;
            if (n < min) min = n;
        }

        if (count == 0) {
            System.out.println("No numbers entered.");
        } else {
            double average = (double) sum / count;

            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
            System.out.println("Sum = " + sum);
            System.out.printf("Average = %.6f\n", average);
        }
    }
}
