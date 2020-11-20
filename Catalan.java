import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;

class Catalan{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        while(testcases-->0){

            int n=sc.nextInt();
            BigInteger[] dp=new BigInteger[n+1];

            dp[0]=BigInteger.valueOf(1);
            dp[1]=BigInteger.valueOf(1);

            for(int i=2;i<=n;i=i+1){

                dp[i]=BigInteger.valueOf(0);
                
                for(int j=0;j<i;j=j+1){
                    BigInteger a= dp[j].multiply(dp[i-j-1]);
                    dp[i]=dp[i].add(a);
                }
            }

            System.out.println(dp[n]);
        }

    }
}