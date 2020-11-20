import java.util.*;
import java.io.*;
import java.lang.*;

class PeakElement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i=i+1){
            a[i]=sc.nextInt();
        }

        int max=a[0],index=0;

        for(int i=1;i<n;i=i+1){
            if(max<a[i]){
                max=a[i];
                index=i;
            }
        }

        System.out.println(index);

    }
}