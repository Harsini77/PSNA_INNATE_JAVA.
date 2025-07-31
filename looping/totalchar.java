import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int j=0;j<a;j++){
            for(int i=97;i<=122;i++){
                System.out.print((char)i+" ");
            }
                System.out.println();
        }
    }
}