import java.util.*;
import java.io.*;
import java.lang.*;

class MinSum {

    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){

            int n=sc.nextInt();
            int arr[]=new int[n];
            int s1=0;
            int s2=0;


            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);

            for(int i=0;i<n;i=i+1){
                if(i%2==0){
                    s1=s1*10+arr[i];
                }
                else{
                    s2=s2*10+arr[i];
                }
            }

            System.out.println(s1+s2);

        }

    }

}
