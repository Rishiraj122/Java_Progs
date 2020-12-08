import java.util.*;
import java.io.*;
import java.lang.*;

class linkedlistpractice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LinkedList<Integer> lis=new LinkedList<Integer>();
        LinkedList<Integer> temp=new LinkedList<Integer>();

        for(int i=0;i<n;i=i+1){
            int x=sc.nextInt();
            lis.add(x);
        }

        for(int i=0;i<n;i=i+1){
            if(i%2!=0){
                lis.remove(i);
            }
        }

        int size=lis.size();

        for(int i=0;i<size;i=i+1){
            System.out.print(lis.get(i)+" ");
        }

        System.out.println();


    }
}
