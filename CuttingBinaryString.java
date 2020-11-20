import java.util.*;
import java.lang.*;
import java.io.*;

public class CuttingBinaryString {

    static boolean power(long num){
        if(num<125){
            return (num==1 || num==5 || num==25 || num==125);
        }
        if(num%125!=0){
            return false;
        }
        else{
            return power(num/5);
        }

    }

    static long decimalnum(String st, int i, int j){

        long decimal=0;
        for(int k=j;k<i;k=k+1){
            decimal=decimal*2 + (st.charAt(k) - '0');
        }

        return decimal;
    }

    static int min(String st, int len){

        int[] dp=new int[len+1];

        Arrays.fill(dp, len+1);
        dp[0]=0;

        for(int i=1;i<=len;i=i+1){
            if(st.charAt(i-1)=='0'){
                continue;
            }
            for(int j=0;j<i;j=j+1){
                if(st.charAt(j)=='0'){
                    continue;
                }
            
                long num=decimalnum(st,i,j);
                if(power(num)){
                    dp[i]=Math.min(dp[i],dp[j]+1);
                }
            }

        }
        return ((dp[len] < len + 1) ? dp[len] : -1);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        String st=sc.next();
        int len=st.length();

        System.out.println(min(st,len));
     
    }
}
