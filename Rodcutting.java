import java.util.*;
import java.lang.*;
import java.io.*;

class Rodcutting{

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int testcases=sc.nextInt();

        while(testcases-->0){

            int n=sc.nextInt();
            int arr[]=new int[n];
            int b[]=new int[n];
            int dp[][]=new int[200][200];

            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();
                b[i]=i+1;
            }

            for(int i=0;i<n+1;i=i+1){
                for(int j=0;j<n+1;j=j+1){
                    if(i==0 || j==0){
                        dp[i][j]=0;
                    }
                }
            }

            for(int i=1;i<n+1;i=i+1){
                for(int j=1;j<n+1;j=j+1){
                    if(b[i-1]<=j){
                        dp[i][j]=Math.max(arr[i-1]+dp[i][j-b[i-1]],dp[i-1][j]);
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }

            System.out.println(dp[n][n]);
        }

    }
}