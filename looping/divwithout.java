import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a ,b;
        a= sc.nextInt();
        b=sc.nextInt();
        int sum=0,count=0;
        
        while(a>=b){
            a=a-b;
            count++;
        }
        System.out.println(count);
        
    }
}