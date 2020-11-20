import java.util.*;
import java.lang.*;
import java.io.*;

class DistinctOccurences {

    static int subsequenceCount(String S, String T){
    
        int n=S.length();
        int m=T.length();
        char[] str1 = S.toCharArray();
        char[] str2 = T.toCharArray();
        
        int[][] dp=new int[n+1][m+1];
        
        for(int j=0;j<=m;j=j+1){
            dp[0][j]=0;
        }
        
        for(int i=0;i<=n;i=i+1){
            dp[i][0]=1;
        }
        
        for(int i=1;i<=n;i=i+1){
            for(int j=1;j<=m;j=j+1){
                if(str1[i-1]==str2[j-1]){
                    dp[i][j]=(dp[i-1][j-1]+dp[i-1][j])%1000000007;
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        return dp[n][m];
    
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        while(testcases-->0){

            String S=sc.next();
            String T=sc.next();
            System.out.println(subsequenceCount(S,T));
        }   
    }
}
