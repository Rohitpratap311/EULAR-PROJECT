import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
        //#Rohitpratap311
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long first=0,second=1,fab=0,evensum=0;
            while(second<=n){
                fab=first+second;
                first=second;
                second=fab;
                if(fab%2==0&&fab<n){
                    evensum+=fab;
                }
            }
            System.out.println(evensum);
            
        }
    }
}
