import java.util.*;
import java.lang.*;
import java.io.*;

class EquilibriumIndex {
    
    public static int equilibrium(long arr[], int N){

        long temp=0;
        long sum=0;
        for(int i=0;i<N;i=i+1){
            sum=sum+arr[i];
        }

        for(int i=0;i<N;i=i+1){
            sum=sum-arr[i];
            if(sum==temp){
                return i+1;
            }
            else{
                temp=temp+arr[i];
            }
        }

        return -1;

    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        long[] arr=new long[n];

        for(int i=0;i<n;i=i+1){
            arr[i]=sc.nextLong();
        }

        System.out.println(equilibrium(arr, n));

    }

}
