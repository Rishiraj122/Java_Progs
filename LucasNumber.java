import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class LucasNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        BigInteger[] dp=new BigInteger[n+1];

        dp[0]=BigInteger.valueOf(2);
        dp[1]=BigInteger.valueOf(1);

        for(int i=2;i<=n;i=i+1){
            BigInteger x=dp[i-2];
            BigInteger y=dp[i-1];
            dp[i]=y.add(x);
        }

        BigInteger y = BigInteger.valueOf(1000000007);
        BigInteger x=dp[n].remainder(y);

        System.out.println(x);

    }
}