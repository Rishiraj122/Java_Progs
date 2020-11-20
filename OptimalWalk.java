import java.util.*;
import java.lang.*;
import java.io.*;

class OptimalWalk {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        while(testcases-->0){
            int N=sc.nextInt();
            long A=sc.nextLong();
            long B=sc.nextLong();

            long[] dp=new long[N+1];

            dp[0]=0;
            dp[1]=A;

            for(int i=2;i<=N;i=i+1){
                dp[i]=Math.min(A+dp[i-1],(i%2)*A+dp[(i+1)/2]+B);
            }

            System.out.println(dp[N]);

        }

    }
}
