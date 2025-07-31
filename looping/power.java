import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ,p=1;
        a=sc.nextInt();
        for(int i=1;i<a;i++){
            p=p*2;
            if(p==a){
              System.out.println("YES");
                return;
            
            }
            if(p>a){
                  System.out.println("NO");
                return;
            }
        }
       
    }
}