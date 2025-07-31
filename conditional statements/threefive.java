import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%3==0&&n%5==0){
            System.out.println("HiHello");
        }
        else if(n%3==0){
            System.out.println("Hi");
        }
        else if(n%5==0){
            System.out.println("Hello");
        }
    }
}