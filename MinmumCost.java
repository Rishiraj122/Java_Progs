import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class MinmumCost{

    static int max(int a, int b){
        return (a>b ? a:b);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int cx=sc.nextInt();
        int cy=sc.nextInt();
        String x=sc.next();
        String y=sc.next();
        char[] X=new char[x.length()];
        char[] Y=new char[y.length()];
        int[][] dp=new int[cx+2][cy+2];

        for(int i=0;i<x.length();i=i+1){
            X[i]=x.charAt(i);
        }

        for(int i=0;i<y.length();i=i+1){
            Y[i]=y.charAt(i);
        }

        for(int i=0;i<=x.length();i=i+1){
            for(int j=0;j<=y.length();j=j+1){
                dp[i][j]=0;
            }
        }

        for(int i=1;i<=x.length();i=i+1){
            for(int j=1;j<=y.length();j=j+1){
                if(X[i-1]==Y[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        for(int i=0;i<=x.length();i=i+1){
            for(int j=0;j<=y.length();j=j+1){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        int k=dp[x.length()][y.length()];
        int result=cx*(x.length()-k)+cy*(y.length()-k);

        System.out.println(result);

    }
}