import java.util.*;
import java.lang.*;
import java.io.*;

class SumofAllSubstrings{

    public static long sumSubstrings(String s){
        long len=s.length();
        long[] dp=new long[100000];
        dp[0]=s.charAt(0) - '0';    
        long res=dp[0]; //res stores the sum value 

        for(int i=1;i<len;i=i+1){
            
            long temp=s.charAt(i) - '0';
            dp[i]=(((i+1)*temp)+(10*dp[i-1]))%1000000007;
            res=(res+dp[i]) % 1000000007;

        }

        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        System.out.print(sumSubstrings(str));
    }
}







// 421
// 4 

// (1+1)*2 + 10* 4 = 44

// (2+1)*1 + 10* ( 44 ) = 443

// 443 + 44 + 4 = 491 