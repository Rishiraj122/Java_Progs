import java.util.*;
import java.lang.*;
import java.io.*;

class Minenergy{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();


        while(testcases-->0){

            int n=sc.nextInt();
            int[] arr=new int[n];

            int energy=1;
            int a=0;

            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();
            }

            for(int i=0;i<n;i=i+1){
                if(arr[i]<=0){
                    energy=energy+a;
                    if(energy < -1*arr[i]){
                        energy=(-1*arr[i]-a)+1;
                    }
                }
                else{
                    a=a+arr[i];
                }
            }

            System.out.println(energy);
        }
    }
}