import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        for(int i=2;i<=n;i++){
            int count=0;
            while(n%i==0){
                count++;
               n/=i;
            }
             
            if(count>0)
            System.out.println(i+"->"+count);
        }
        
        
        
    }
}