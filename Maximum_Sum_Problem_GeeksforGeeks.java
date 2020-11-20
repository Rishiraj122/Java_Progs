import java.util.*;

class Maximum_Sum_Problem_GeeksforGeeks{
    public static void main(String args[]){
        int dp[]=new int[100001];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=100000;i=i+1){
            dp[i]=Math.max(dp[i/2]+dp[i/3]+dp[i/4],i);
        }
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            int n=sc.nextInt();
            System.out.println(dp[n]);
        }
    }
}