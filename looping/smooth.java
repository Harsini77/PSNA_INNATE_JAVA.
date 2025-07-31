import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isSmooth = false;

        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) {
                isSmooth = true;
                break;
            }
        }

        if (isSmooth) {
            System.out.println("Smooth Number");
        } else {
            System.out.println("Not a Smooth Number");
        }
    }
}
