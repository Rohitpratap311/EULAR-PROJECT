import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            //#Rohitpratap311
            long sum=0;
            long c3=n-(n%3);
            long c5=n-(n%5);
            long c15=n-(n%15);
            if(c3==n){
                c3=c3-3;
            }
            if(c5==n){
                c5=c5-5;
            }
            if(c15==n){
                c15=c15-15;
            }
            
            long t3=((c3-3)/3)+1;
            long t5=((c5-5)/5)+1;
            long t15=((c15-15)/15)+1;
            long s3=(t15*(15+c15))/2;
            long s1=(t3*(3+c3))/2;
            long s2=(t5*(5+c5))/2;
            sum=s1+s2-s3;
            
            /*for(int i=3;i<n;i++){
                if((i%3==0)||(i%5==0)){     TEST CASE 2 & 3 HAVE VERY LARGE I/P
                                          SO LOOP IS TAKING LONG TIME :) 
                    sum=sum+i;
                }
            }*/
            System.out.println(sum);
        
        }
    }
}
