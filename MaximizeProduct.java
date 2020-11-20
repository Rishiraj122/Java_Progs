import java.util.*;
import java.lang.*;
import java.io.*;

class MaximizeProduct{

    public int productMaximize(int n){

        int[] dp=new int[n+1];
        int result=0;
        dp[0]=dp[1]=1;

        for(int i=1;i<=n;i=i+1){
            for(int j=1;j<=i/2;j=j+1){
                result=Math.max(Math.max(result, j*(i-j)), j*dp[i-j]);
                dp[i]=result;
            }
        }

        return dp[n];

    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        MaximizeProduct mp=new MaximizeProduct();
        System.out.println(mp.productMaximize(n));

    }
}