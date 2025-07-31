import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        if(perfectdiv(a)==b&&perfectdiv(b)==a){
            System.out.println("Amicable Pair");
        }
        else{
             System.out.println("Not a Amicable Pair");
        }
        
        
        
    }
    public static int perfectdiv(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}