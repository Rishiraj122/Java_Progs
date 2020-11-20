import java.util.*;
import java.io.*;
import java.math.*;
import java.lang.*;

class GetMinimumSquares{
    static int GetMinSquare(int n){
        int[] dp=new int[n+1];

        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;

        for(int i=4;i<=n;i=i+1){
            dp[i]=i;
        
            for(int j=1;j<=Math.ceil(Math.sqrt(i));j=j+1){
                int x=j*j;
                if(x>i){
                    break;
                }
                else{
                    dp[i]=Math.min(dp[i],1+dp[i-x]);
                }
            }
        }

        return dp[n];

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int res=GetMinSquare(n);
            System.out.println(res);
        }
    }
}