import java.util.*;
import java.io.*;
import java.lang.*;

class ArrayExtra{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=sc.nextInt();

        int a[]=new int[n];
        int b[]=new int[n2];
        int s1=0;
        int s2=0;
        int index=0;

        for(int i=0;i<n;i=i+1){
            a[i]=sc.nextInt();
            s1=s1+a[i];
        }

        for(int i=0;i<n2;i=i+1){
            b[i]=sc.nextInt();
            s2=s2+b[i];

        }

        if(n>n2){
            s1=s1-s2;
            for(int i=0;i<n;i=i+1){
                if(s1==a[i]){
                    index=i;
                }
            }
        }

        else{
            s2=s2-s1;
            for(int i=0;i<n2;i=i+1){
                if(s2==b[i]){
                    index=i;
                }
            }
        }

        System.out.println(index);

    
    }
}