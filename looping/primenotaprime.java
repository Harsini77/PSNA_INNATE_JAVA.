import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   
    public static void main(String[] args) {
        int n;
        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Not a Prime Number");
            return;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}
