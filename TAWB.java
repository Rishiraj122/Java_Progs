import java.util.*;
import java.lang.*;
import java.io.*;

class TAWB{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,c,t;
        n=sc.nextInt();
        c=sc.nextInt();
        t=n*2;
        int[] w=new int[n];
        int[] p=new int[n];

        for(int i=0;i<n;i=i+1){
            w[i]=sc.nextInt();
            p[i]=sc.nextInt();

            double x= Math.sqrt(w[i]);
            x=x-Math.floor(x);
            if(x==0){
                w[i]=0;
                p[i]=0;
            }

        }

        for(int i=0;i<n;i=i+1){
            System.out.println(w[i]);
            System.out.println(p[i]);
        }

    }
}